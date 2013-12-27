Type=StaticCode
Version=3
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	
	'Variável a ser usada quando executar algum comando no banco.
	Dim SQL As SQL
	Dim C As Cursor
	
	Dim Contador_Ajuste As Int = 2
	
	'Monta Array com nome de todas as tabelas
	Dim Nome_Tabela(8) As String
	Nome_Tabela(0) = "tab_filiais"
	Nome_Tabela(1) = "tab_parametros"
	Nome_Tabela(2) = "tab_cliente"
	Nome_Tabela(3) = "tab_estoque"
	Nome_Tabela(4) = "tab_contas_receber"
	Nome_Tabela(5) = "tab_pedido"
	Nome_Tabela(6) = "tab_prod_pedido"
	Nome_Tabela(7) = "tab_visita"
	
	'Monta Array com todos os campos da tabela TAB_FILIAIS (OBS:. A CADA CAMPO CRIADO, BASTA ADICIONAR AO FINAL DA LINHA E INCREMENTAR A VARIAVEL CONTADOR_AJUSTE.)
	Dim Campos_Tab_Filiais() As String
	Campos_Tab_Filiais = Array As String("nreg","ponto","nome_fantasia","endereco","bairro","cep","cidade","estado","cnpj","inscricao","razao","telefone1","telefone2","inscricao_municipal","data_inicio","dt_inicio","data_limite","dt_limite","codigo_municipio","email","data_integracao","dt_integracao")
	
	'Monta Array com todos os campos da tabela TAB_PARAMETROS
	Dim Campos_Tab_Parametros() As String
	Campos_Tab_Parametros = Array As String("nreg","contador_ajuste","contador_venda","contador_cliente","contador","contador_nota_fiscal","contador_nf_servico","ponto","rota","perfil_qemp","data_integracao","dt_integracao")
	
	'Monta Array com todos os campos da tabela TAB_CLIENTE
	Dim Campos_Tab_Cliente() As String
	Campos_Tab_Cliente = Array As String("nreg","nome_fantasia","razao_social","endereco","bairro","cidade","estado","telefone1","telefone2","cep","inscricao_estadual","incricao_municipal","cnpj","data_integracao","dt_integracao")
	
	'Monta Array com todos os campos da tabela TAB_ESTOQUE
	Dim Campos_Tab_Estoque() As String
	Campos_Tab_Estoque = Array As String("nreg","produto","grupo","observacao","grupo","codigo","preco_internet","preco_corporativo","preco_parcelado","preco_revenda","preco_tabela","unid","conversor","prateleira","caixa","volume","entrega","data_inicio_promocao","dt_inicio_promocao","data_fim_promocao","dt_fim_promocao","retornar_preco","iniciar_preco","promocao","codigo_interno","inativo","data_integracao","dt_integracao")
	
	'Monta Array com todos os campos da tabela TAB_CONTAS_RECEBER
	Dim Campos_Tab_Contas_Receber() As String
	Campos_Tab_Contas_Receber = Array As String("nreg","observacao","nome","data_pagamento","dt_pagamento","valor_pago","valor_juros","numero_interno","automatico","filial","tipo_pagamento","valor","cnpj","data_inclusao","dt_inclusao","vencimento_data","vencimento_dt","data_baixa","dt_baixa","data_integracao","dt_integracao")
	
	'Monta Array com todos os campos da tabela TAB_PEDIDO
	Dim Campos_Tab_Pedido() As String
	Campos_Tab_Pedido = Array As String("nreg","data","dt","ponto","horario","operador","numero","cliente","nreg_cliente","total","desconto_valor","desconto_percentual","acrescimo","sub_total","cnpj","data_entrega","dt_entrega","endereco","cancelado","autorizado_por","dinheiro","cheque","cartao","parcelado","financiado","numero_nf","obs_venda","data_cancelamento","dt_cancelamento","cancelado_por","terminal_caixa","motivo_cancelamento","bairro","cep","cidade","tem_entrega","desconto_real","incluido_por","rede_cliente","data_integracao","dt_integracao","numero_envelope")
	
	'Monta Array com todos os campos da tabela TAB_PROD_PEDIDO
	Dim Campos_Tab_Prod_Pedido() As String
	Campos_Tab_Prod_Pedido = Array As String("nreg","data","dt","produto","quantidade","ponto","ponto_origem","codigo","horario","operador","numero","cliente","nreg_cliente","preco","total","desconto_valor","desconto_percentual","acrescimo","obs_produto","grupo","desconto_valor_individual","desconto_percentual_individual","codigo_fornecedor","data_entrega","dt_entrega","percentual_total_pedido","unid","codigo_interno")
	
	'Monta Array com todos os campos da tabela TAB_VISITA
	Dim Campos_Tab_Visita() As String
	Campos_Tab_Visita = Array As String("nreg","nome_cliente","endereco","bairro","cidade","estado","cep","data","dt","motivo_nao_venda","localizacao")
	
	
		

End Sub

Sub Verifica_Banco()

	Dim Caminho_Padrao As String
	Dim FraseSql As String
	'Abaixo, verificando se o dispositivo tem memória externa (ex. cartao de memoria)
	'se tiver, a variavel Caminho_Padrao recebe esse repositorio de arquivos, caso contrário,
	'vai receber o reposiório interno do dispositivo (memória interna.)
	If File.ExternalWritable Then
		Caminho_Padrao = File.DirDefaultExternal 'Memoria externa (cartao de memoria)
	Else
		Caminho_Padrao = File.DirInternal 'Memoria interna (memória do dispositivo)
	End If
	
	If File.Exists(Caminho_Padrao,"cadastros.db")=False Then
		File.Copy(File.DirAssets,"cadastros.db",Caminho_Padrao,"cadastros.db")
	End If
	
	'Aqui, já defini o caminho do banco de dados e copiei o arquivo caso não exista.
	
	'Inicializando o Banco cadastros.db
	SQL.Initialize(Caminho_Padrao,"cadastros.db",True)
	
End Sub

Sub Cria_Tabelas(Operacao As Int,Tabela As String)
	
	'Se operaçao for 1 é que quero atualizar o banco rodando por todas as tabelas
	If Operacao = 1 Then
	
		For i = 0 To Nome_Tabela.Length -1
			
			Try
			SQL.ExecNonQuery("CREATE TABLE " + Nome_Tabela(i) + " (nreg TEXT)")
			'adiciona tabela
			Catch
			End Try
		
		Next
	
	'Se operaçao for 2 é que quero criar uma única tabela
	Else If Operacao = 2 Then
	
		Try
		SQL.ExecNonQuery("CREATE TABLE " + Tabela + " (nreg TEXT)")
		'Verifica_Campos(Tabela)
		Catch
		End Try
		
	End If
		
End Sub

Sub Verifica_Campos(Operacao As Int,Tabela As String)
	
	If Operacao = 1 Then
		'Vou verificar campos de todas as tabelas
		
		For i = 0 To Nome_Tabela.Length -1
			
			Select Nome_Tabela(i)
				
				Case "tab_filiais"
					'faz o for com o array Campos_Tab_Filiais()
					
					For i = 0 To Campos_Tab_Filiais.Length -1
						Try
							SQL.ExecNonQuery("ALTER TABLE tab_filiais ADD " + Campos_Tab_Filiais(i) + "	TEXT")
						Catch
							'campo já existe.
						End Try
					Next
					
				Case "tab_parametros"
					'faz o for com o array Campos_Tab_Parametros()
					
					For i = 0 To Campos_Tab_Parametros.Length -1
						Try
							SQL.ExecNonQuery("ALTER TABLE tab_parametros ADD " + Campos_Tab_Parametros(i) + " TEXT")
						Catch
							'campo já existe.
						End Try
					Next
					
				Case "tab_cliente"
					'faz o for com o array Campos_Tab_Cliente()
					
					For i = 0 To Campos_Tab_Cliente.Length -1
						Try
							SQL.ExecNonQuery("ALTER TABLE tab_cliente ADD " + Campos_Tab_Cliente(i) + " TEXT")
						Catch
							'campo já existe.
						End Try
					Next
				
				Case "tab_estoque"
					'faz o for com o array Campos_Tab_Estoque()
					
					For i = 0 To Campos_Tab_Estoque.Length -1
						Try
							SQL.ExecNonQuery("ALTER TABLE tab_estoque ADD " + Campos_Tab_Estoque(i) + " TEXT")
						Catch
							'campo já existe.
						End Try
					Next
					
				Case "tab_contas_receber"
					'faz o for com o array Campos_Tab_Contas_Receber()
					
					For i = 0 To Campos_Tab_Contas_Receber.Length -1
						Try
							SQL.ExecNonQuery("ALTER TABLE tab_contas_receber ADD " + Campos_Tab_Contas_Receber(i) + " TEXT")
						Catch
							'campo já existe.
						End Try
					Next
					
				Case "tab_pedido"
					'faz o for com o array Campos_Tab_Pedido()
					
					For i = 0 To Campos_Tab_Pedido.Length -1
						Try
							SQL.ExecNonQuery("ALTER TABLE tab_pedido ADD " + Campos_Tab_Pedido(i) + " TEXT")
						Catch
							'campo já existe.
						End Try
					Next
				
				Case "tab_prod_pedido"
					'faz o for com o array Campos_Tab_Prod_Pedido()
					
					For i = 0 To Campos_Tab_Prod_Pedido.Length -1
						Try
							SQL.ExecNonQuery("ALTER TABLE tab_prod_pedido ADD " + Campos_Tab_Prod_Pedido(i) + " TEXT")
						Catch
							'campo já existe.
						End Try
					Next
					
				Case "tab_visita"
					'faz o for com o array Campos_Tab_Visita()
					
					For i = 0 To Campos_Tab_Visita.Length -1
						Try
							SQL.ExecNonQuery("ALTER TABLE tab_visita ADD " + Campos_Tab_Visita(i) + " TEXT")
						Catch
							'campo já existe.
						End Try
					Next
					
			End Select
			
		Next
		
	Else If Operacao = 2 Then
		'Vou verificar campos de uma tabela específica
	End If
	
	
End Sub



