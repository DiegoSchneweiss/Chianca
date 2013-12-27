package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class db_subs_0 {


public static RemoteObject  _cria_tabelas(RemoteObject _ba,RemoteObject _operacao,RemoteObject _tabela) throws Exception{
		Debug.PushSubsStack("Cria_Tabelas (db) ","db",1,_ba,db.mostCurrent);
try {
int _i = 0;
;
Debug.locals.put("Operacao", _operacao);
Debug.locals.put("Tabela", _tabela);
 BA.debugLineNum = 85;BA.debugLine="Sub Cria_Tabelas(Operacao As Int,Tabela As String)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 88;BA.debugLine="If Operacao = 1 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_operacao,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 90;BA.debugLine="For i = 0 To Nome_Tabela.Length -1";
Debug.ShouldStop(33554432);
{
final int step45 = 1;
final int limit45 = RemoteObject.solve(new RemoteObject[] {db._nome_tabela.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step45 > 0 && _i <= limit45) || (step45 < 0 && _i >= limit45); _i = ((int)(0 + _i + step45))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 92;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 93;BA.debugLine="SQL.ExecNonQuery(\"CREATE TABLE \" + Nome_Tabela(i) + \" (nreg TEXT)\")";
Debug.ShouldStop(268435456);
db._sql.runVoidMethod ("ExecNonQuery",(Object)(BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(int.class, "CREATE TABLE "),BA.numberCast(int.class, db._nome_tabela.getArrayElement(true,BA.numberCast(int.class, _i))),BA.numberCast(int.class, " (nreg TEXT)")}, "++",2, 1))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e49) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e49.toString()); };
 }
}Debug.locals.put("i", _i);
;
 }else 
{ BA.debugLineNum = 101;BA.debugLine="Else If Operacao = 2 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_operacao,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 103;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 104;BA.debugLine="SQL.ExecNonQuery(\"CREATE TABLE \" + Tabela + \" (nreg TEXT)\")";
Debug.ShouldStop(128);
db._sql.runVoidMethod ("ExecNonQuery",(Object)(BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(int.class, "CREATE TABLE "),BA.numberCast(int.class, _tabela),BA.numberCast(int.class, " (nreg TEXT)")}, "++",2, 1))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e55) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e55.toString()); };
 }};
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Dim SQL As SQL";
db._sql = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 9;BA.debugLine="Dim C As Cursor";
db._c = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 11;BA.debugLine="Dim Contador_Ajuste As Int = 2";
db._contador_ajuste = BA.numberCast(int.class, 2);
 //BA.debugLineNum = 14;BA.debugLine="Dim Nome_Tabela(8) As String";
db._nome_tabela = RemoteObject.createNewArray ("String", new int[] {8}, new Object[]{});
 //BA.debugLineNum = 15;BA.debugLine="Nome_Tabela(0) = \"tab_filiais\"";
db._nome_tabela.setArrayElement (BA.ObjectToString("tab_filiais"),BA.numberCast(int.class, 0));
 //BA.debugLineNum = 16;BA.debugLine="Nome_Tabela(1) = \"tab_parametros\"";
db._nome_tabela.setArrayElement (BA.ObjectToString("tab_parametros"),BA.numberCast(int.class, 1));
 //BA.debugLineNum = 17;BA.debugLine="Nome_Tabela(2) = \"tab_cliente\"";
db._nome_tabela.setArrayElement (BA.ObjectToString("tab_cliente"),BA.numberCast(int.class, 2));
 //BA.debugLineNum = 18;BA.debugLine="Nome_Tabela(3) = \"tab_estoque\"";
db._nome_tabela.setArrayElement (BA.ObjectToString("tab_estoque"),BA.numberCast(int.class, 3));
 //BA.debugLineNum = 19;BA.debugLine="Nome_Tabela(4) = \"tab_contas_receber\"";
db._nome_tabela.setArrayElement (BA.ObjectToString("tab_contas_receber"),BA.numberCast(int.class, 4));
 //BA.debugLineNum = 20;BA.debugLine="Nome_Tabela(5) = \"tab_pedido\"";
db._nome_tabela.setArrayElement (BA.ObjectToString("tab_pedido"),BA.numberCast(int.class, 5));
 //BA.debugLineNum = 21;BA.debugLine="Nome_Tabela(6) = \"tab_prod_pedido\"";
db._nome_tabela.setArrayElement (BA.ObjectToString("tab_prod_pedido"),BA.numberCast(int.class, 6));
 //BA.debugLineNum = 22;BA.debugLine="Nome_Tabela(7) = \"tab_visita\"";
db._nome_tabela.setArrayElement (BA.ObjectToString("tab_visita"),BA.numberCast(int.class, 7));
 //BA.debugLineNum = 25;BA.debugLine="Dim Campos_Tab_Filiais() As String";
db._campos_tab_filiais = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 26;BA.debugLine="Campos_Tab_Filiais = Array As String(\"nreg\",\"ponto\",\"nome_fantasia\",\"endereco\",\"bairro\",\"cep\",\"cidade\",\"estado\",\"cnpj\",\"inscricao\",\"razao\",\"telefone1\",\"telefone2\",\"inscricao_municipal\",\"data_inicio\",\"dt_inicio\",\"data_limite\",\"dt_limite\",\"codigo_municipio\",\"email\",\"data_integracao\",\"dt_integracao\")";
db._campos_tab_filiais = RemoteObject.createNewArray("String",new int[] {22},new Object[] {BA.ObjectToString("nreg"),BA.ObjectToString("ponto"),BA.ObjectToString("nome_fantasia"),BA.ObjectToString("endereco"),BA.ObjectToString("bairro"),BA.ObjectToString("cep"),BA.ObjectToString("cidade"),BA.ObjectToString("estado"),BA.ObjectToString("cnpj"),BA.ObjectToString("inscricao"),BA.ObjectToString("razao"),BA.ObjectToString("telefone1"),BA.ObjectToString("telefone2"),BA.ObjectToString("inscricao_municipal"),BA.ObjectToString("data_inicio"),BA.ObjectToString("dt_inicio"),BA.ObjectToString("data_limite"),BA.ObjectToString("dt_limite"),BA.ObjectToString("codigo_municipio"),BA.ObjectToString("email"),BA.ObjectToString("data_integracao"),BA.ObjectToString("dt_integracao")});
 //BA.debugLineNum = 29;BA.debugLine="Dim Campos_Tab_Parametros() As String";
db._campos_tab_parametros = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 30;BA.debugLine="Campos_Tab_Parametros = Array As String(\"nreg\",\"contador_ajuste\",\"contador_venda\",\"contador_cliente\",\"contador\",\"contador_nota_fiscal\",\"contador_nf_servico\",\"ponto\",\"rota\",\"perfil_qemp\",\"data_integracao\",\"dt_integracao\")";
db._campos_tab_parametros = RemoteObject.createNewArray("String",new int[] {12},new Object[] {BA.ObjectToString("nreg"),BA.ObjectToString("contador_ajuste"),BA.ObjectToString("contador_venda"),BA.ObjectToString("contador_cliente"),BA.ObjectToString("contador"),BA.ObjectToString("contador_nota_fiscal"),BA.ObjectToString("contador_nf_servico"),BA.ObjectToString("ponto"),BA.ObjectToString("rota"),BA.ObjectToString("perfil_qemp"),BA.ObjectToString("data_integracao"),BA.ObjectToString("dt_integracao")});
 //BA.debugLineNum = 33;BA.debugLine="Dim Campos_Tab_Cliente() As String";
db._campos_tab_cliente = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 34;BA.debugLine="Campos_Tab_Cliente = Array As String(\"nreg\",\"nome_fantasia\",\"razao_social\",\"endereco\",\"bairro\",\"cidade\",\"estado\",\"telefone1\",\"telefone2\",\"cep\",\"inscricao_estadual\",\"incricao_municipal\",\"cnpj\",\"data_integracao\",\"dt_integracao\")";
db._campos_tab_cliente = RemoteObject.createNewArray("String",new int[] {15},new Object[] {BA.ObjectToString("nreg"),BA.ObjectToString("nome_fantasia"),BA.ObjectToString("razao_social"),BA.ObjectToString("endereco"),BA.ObjectToString("bairro"),BA.ObjectToString("cidade"),BA.ObjectToString("estado"),BA.ObjectToString("telefone1"),BA.ObjectToString("telefone2"),BA.ObjectToString("cep"),BA.ObjectToString("inscricao_estadual"),BA.ObjectToString("incricao_municipal"),BA.ObjectToString("cnpj"),BA.ObjectToString("data_integracao"),BA.ObjectToString("dt_integracao")});
 //BA.debugLineNum = 37;BA.debugLine="Dim Campos_Tab_Estoque() As String";
db._campos_tab_estoque = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 38;BA.debugLine="Campos_Tab_Estoque = Array As String(\"nreg\",\"produto\",\"grupo\",\"observacao\",\"grupo\",\"codigo\",\"preco_internet\",\"preco_corporativo\",\"preco_parcelado\",\"preco_revenda\",\"preco_tabela\",\"unid\",\"conversor\",\"prateleira\",\"caixa\",\"volume\",\"entrega\",\"data_inicio_promocao\",\"dt_inicio_promocao\",\"data_fim_promocao\",\"dt_fim_promocao\",\"retornar_preco\",\"iniciar_preco\",\"promocao\",\"codigo_interno\",\"inativo\",\"data_integracao\",\"dt_integracao\")";
db._campos_tab_estoque = RemoteObject.createNewArray("String",new int[] {28},new Object[] {BA.ObjectToString("nreg"),BA.ObjectToString("produto"),BA.ObjectToString("grupo"),BA.ObjectToString("observacao"),BA.ObjectToString("grupo"),BA.ObjectToString("codigo"),BA.ObjectToString("preco_internet"),BA.ObjectToString("preco_corporativo"),BA.ObjectToString("preco_parcelado"),BA.ObjectToString("preco_revenda"),BA.ObjectToString("preco_tabela"),BA.ObjectToString("unid"),BA.ObjectToString("conversor"),BA.ObjectToString("prateleira"),BA.ObjectToString("caixa"),BA.ObjectToString("volume"),BA.ObjectToString("entrega"),BA.ObjectToString("data_inicio_promocao"),BA.ObjectToString("dt_inicio_promocao"),BA.ObjectToString("data_fim_promocao"),BA.ObjectToString("dt_fim_promocao"),BA.ObjectToString("retornar_preco"),BA.ObjectToString("iniciar_preco"),BA.ObjectToString("promocao"),BA.ObjectToString("codigo_interno"),BA.ObjectToString("inativo"),BA.ObjectToString("data_integracao"),BA.ObjectToString("dt_integracao")});
 //BA.debugLineNum = 41;BA.debugLine="Dim Campos_Tab_Contas_Receber() As String";
db._campos_tab_contas_receber = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 42;BA.debugLine="Campos_Tab_Contas_Receber = Array As String(\"nreg\",\"observacao\",\"nome\",\"data_pagamento\",\"dt_pagamento\",\"valor_pago\",\"valor_juros\",\"numero_interno\",\"automatico\",\"filial\",\"tipo_pagamento\",\"valor\",\"cnpj\",\"data_inclusao\",\"dt_inclusao\",\"vencimento_data\",\"vencimento_dt\",\"data_baixa\",\"dt_baixa\",\"data_integracao\",\"dt_integracao\")";
db._campos_tab_contas_receber = RemoteObject.createNewArray("String",new int[] {21},new Object[] {BA.ObjectToString("nreg"),BA.ObjectToString("observacao"),BA.ObjectToString("nome"),BA.ObjectToString("data_pagamento"),BA.ObjectToString("dt_pagamento"),BA.ObjectToString("valor_pago"),BA.ObjectToString("valor_juros"),BA.ObjectToString("numero_interno"),BA.ObjectToString("automatico"),BA.ObjectToString("filial"),BA.ObjectToString("tipo_pagamento"),BA.ObjectToString("valor"),BA.ObjectToString("cnpj"),BA.ObjectToString("data_inclusao"),BA.ObjectToString("dt_inclusao"),BA.ObjectToString("vencimento_data"),BA.ObjectToString("vencimento_dt"),BA.ObjectToString("data_baixa"),BA.ObjectToString("dt_baixa"),BA.ObjectToString("data_integracao"),BA.ObjectToString("dt_integracao")});
 //BA.debugLineNum = 45;BA.debugLine="Dim Campos_Tab_Pedido() As String";
db._campos_tab_pedido = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 46;BA.debugLine="Campos_Tab_Pedido = Array As String(\"nreg\",\"data\",\"dt\",\"ponto\",\"horario\",\"operador\",\"numero\",\"cliente\",\"nreg_cliente\",\"total\",\"desconto_valor\",\"desconto_percentual\",\"acrescimo\",\"sub_total\",\"cnpj\",\"data_entrega\",\"dt_entrega\",\"endereco\",\"cancelado\",\"autorizado_por\",\"dinheiro\",\"cheque\",\"cartao\",\"parcelado\",\"financiado\",\"numero_nf\",\"obs_venda\",\"data_cancelamento\",\"dt_cancelamento\",\"cancelado_por\",\"terminal_caixa\",\"motivo_cancelamento\",\"bairro\",\"cep\",\"cidade\",\"tem_entrega\",\"desconto_real\",\"incluido_por\",\"rede_cliente\",\"data_integracao\",\"dt_integracao\",\"numero_envelope\")";
db._campos_tab_pedido = RemoteObject.createNewArray("String",new int[] {42},new Object[] {BA.ObjectToString("nreg"),BA.ObjectToString("data"),BA.ObjectToString("dt"),BA.ObjectToString("ponto"),BA.ObjectToString("horario"),BA.ObjectToString("operador"),BA.ObjectToString("numero"),BA.ObjectToString("cliente"),BA.ObjectToString("nreg_cliente"),BA.ObjectToString("total"),BA.ObjectToString("desconto_valor"),BA.ObjectToString("desconto_percentual"),BA.ObjectToString("acrescimo"),BA.ObjectToString("sub_total"),BA.ObjectToString("cnpj"),BA.ObjectToString("data_entrega"),BA.ObjectToString("dt_entrega"),BA.ObjectToString("endereco"),BA.ObjectToString("cancelado"),BA.ObjectToString("autorizado_por"),BA.ObjectToString("dinheiro"),BA.ObjectToString("cheque"),BA.ObjectToString("cartao"),BA.ObjectToString("parcelado"),BA.ObjectToString("financiado"),BA.ObjectToString("numero_nf"),BA.ObjectToString("obs_venda"),BA.ObjectToString("data_cancelamento"),BA.ObjectToString("dt_cancelamento"),BA.ObjectToString("cancelado_por"),BA.ObjectToString("terminal_caixa"),BA.ObjectToString("motivo_cancelamento"),BA.ObjectToString("bairro"),BA.ObjectToString("cep"),BA.ObjectToString("cidade"),BA.ObjectToString("tem_entrega"),BA.ObjectToString("desconto_real"),BA.ObjectToString("incluido_por"),BA.ObjectToString("rede_cliente"),BA.ObjectToString("data_integracao"),BA.ObjectToString("dt_integracao"),BA.ObjectToString("numero_envelope")});
 //BA.debugLineNum = 49;BA.debugLine="Dim Campos_Tab_Prod_Pedido() As String";
db._campos_tab_prod_pedido = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 50;BA.debugLine="Campos_Tab_Prod_Pedido = Array As String(\"nreg\",\"data\",\"dt\",\"produto\",\"quantidade\",\"ponto\",\"ponto_origem\",\"codigo\",\"horario\",\"operador\",\"numero\",\"cliente\",\"nreg_cliente\",\"preco\",\"total\",\"desconto_valor\",\"desconto_percentual\",\"acrescimo\",\"obs_produto\",\"grupo\",\"desconto_valor_individual\",\"desconto_percentual_individual\",\"codigo_fornecedor\",\"data_entrega\",\"dt_entrega\",\"percentual_total_pedido\",\"unid\",\"codigo_interno\")";
db._campos_tab_prod_pedido = RemoteObject.createNewArray("String",new int[] {28},new Object[] {BA.ObjectToString("nreg"),BA.ObjectToString("data"),BA.ObjectToString("dt"),BA.ObjectToString("produto"),BA.ObjectToString("quantidade"),BA.ObjectToString("ponto"),BA.ObjectToString("ponto_origem"),BA.ObjectToString("codigo"),BA.ObjectToString("horario"),BA.ObjectToString("operador"),BA.ObjectToString("numero"),BA.ObjectToString("cliente"),BA.ObjectToString("nreg_cliente"),BA.ObjectToString("preco"),BA.ObjectToString("total"),BA.ObjectToString("desconto_valor"),BA.ObjectToString("desconto_percentual"),BA.ObjectToString("acrescimo"),BA.ObjectToString("obs_produto"),BA.ObjectToString("grupo"),BA.ObjectToString("desconto_valor_individual"),BA.ObjectToString("desconto_percentual_individual"),BA.ObjectToString("codigo_fornecedor"),BA.ObjectToString("data_entrega"),BA.ObjectToString("dt_entrega"),BA.ObjectToString("percentual_total_pedido"),BA.ObjectToString("unid"),BA.ObjectToString("codigo_interno")});
 //BA.debugLineNum = 53;BA.debugLine="Dim Campos_Tab_Visita() As String";
db._campos_tab_visita = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 54;BA.debugLine="Campos_Tab_Visita = Array As String(\"nreg\",\"nome_cliente\",\"endereco\",\"bairro\",\"cidade\",\"estado\",\"cep\",\"data\",\"dt\",\"motivo_nao_venda\",\"localizacao\")";
db._campos_tab_visita = RemoteObject.createNewArray("String",new int[] {11},new Object[] {BA.ObjectToString("nreg"),BA.ObjectToString("nome_cliente"),BA.ObjectToString("endereco"),BA.ObjectToString("bairro"),BA.ObjectToString("cidade"),BA.ObjectToString("estado"),BA.ObjectToString("cep"),BA.ObjectToString("data"),BA.ObjectToString("dt"),BA.ObjectToString("motivo_nao_venda"),BA.ObjectToString("localizacao")});
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _verifica_banco(RemoteObject _ba) throws Exception{
		Debug.PushSubsStack("Verifica_Banco (db) ","db",1,_ba,db.mostCurrent);
try {
RemoteObject _caminho_padrao = RemoteObject.createImmutable("");
RemoteObject _frasesql = RemoteObject.createImmutable("");
;
 BA.debugLineNum = 61;BA.debugLine="Sub Verifica_Banco()";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 63;BA.debugLine="Dim Caminho_Padrao As String";
Debug.ShouldStop(1073741824);
_caminho_padrao = RemoteObject.createImmutable("");Debug.locals.put("Caminho_Padrao", _caminho_padrao);
 BA.debugLineNum = 64;BA.debugLine="Dim FraseSql As String";
Debug.ShouldStop(-2147483648);
_frasesql = RemoteObject.createImmutable("");Debug.locals.put("FraseSql", _frasesql);
 BA.debugLineNum = 68;BA.debugLine="If File.ExternalWritable Then";
Debug.ShouldStop(8);
if (db.mostCurrent.__c.getField(false,"File").runMethod(true,"getExternalWritable").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 69;BA.debugLine="Caminho_Padrao = File.DirDefaultExternal 'Memoria externa (cartao de memoria)";
Debug.ShouldStop(16);
_caminho_padrao = db.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal");Debug.locals.put("Caminho_Padrao", _caminho_padrao);
 }else {
 BA.debugLineNum = 71;BA.debugLine="Caminho_Padrao = File.DirInternal 'Memoria interna (memória do dispositivo)";
Debug.ShouldStop(64);
_caminho_padrao = db.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal");Debug.locals.put("Caminho_Padrao", _caminho_padrao);
 };
 BA.debugLineNum = 74;BA.debugLine="If File.Exists(Caminho_Padrao,\"cadastros.db\")=False Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",db.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_caminho_padrao),(Object)(BA.ObjectToString("cadastros.db"))),db.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 75;BA.debugLine="File.Copy(File.DirAssets,\"cadastros.db\",Caminho_Padrao,\"cadastros.db\")";
Debug.ShouldStop(1024);
db.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(db.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("cadastros.db")),(Object)(_caminho_padrao),(Object)(BA.ObjectToString("cadastros.db")));
 };
 BA.debugLineNum = 81;BA.debugLine="SQL.Initialize(Caminho_Padrao,\"cadastros.db\",True)";
Debug.ShouldStop(65536);
db._sql.runVoidMethod ("Initialize",(Object)(_caminho_padrao),(Object)(BA.ObjectToString("cadastros.db")),(Object)(db.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _verifica_campos(RemoteObject _ba,RemoteObject _operacao,RemoteObject _tabela) throws Exception{
		Debug.PushSubsStack("Verifica_Campos (db) ","db",1,_ba,db.mostCurrent);
try {
int _i = 0;
;
Debug.locals.put("Operacao", _operacao);
Debug.locals.put("Tabela", _tabela);
 BA.debugLineNum = 113;BA.debugLine="Sub Verifica_Campos(Operacao As Int,Tabela As String)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 115;BA.debugLine="If Operacao = 1 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_operacao,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 118;BA.debugLine="For i = 0 To Nome_Tabela.Length -1";
Debug.ShouldStop(2097152);
{
final int step60 = 1;
final int limit60 = RemoteObject.solve(new RemoteObject[] {db._nome_tabela.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step60 > 0 && _i <= limit60) || (step60 < 0 && _i >= limit60); _i = ((int)(0 + _i + step60))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 120;BA.debugLine="Select Nome_Tabela(i)";
Debug.ShouldStop(8388608);
switch (BA.switchObjectToInt(db._nome_tabela.getArrayElement(true,BA.numberCast(int.class, _i)),BA.ObjectToString("tab_filiais"),BA.ObjectToString("tab_parametros"),BA.ObjectToString("tab_cliente"),BA.ObjectToString("tab_estoque"),BA.ObjectToString("tab_contas_receber"),BA.ObjectToString("tab_pedido"),BA.ObjectToString("tab_prod_pedido"),BA.ObjectToString("tab_visita"))) {
case 0:
 BA.debugLineNum = 125;BA.debugLine="For i = 0 To Campos_Tab_Filiais.Length -1";
Debug.ShouldStop(268435456);
{
final int step63 = 1;
final int limit63 = RemoteObject.solve(new RemoteObject[] {db._campos_tab_filiais.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step63 > 0 && _i <= limit63) || (step63 < 0 && _i >= limit63); _i = ((int)(0 + _i + step63))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 126;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 127;BA.debugLine="SQL.ExecNonQuery(\"ALTER TABLE tab_filiais ADD \" + Campos_Tab_Filiais(i) + \"	TEXT\")";
Debug.ShouldStop(1073741824);
db._sql.runVoidMethod ("ExecNonQuery",(Object)(BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(int.class, "ALTER TABLE tab_filiais ADD "),BA.numberCast(int.class, db._campos_tab_filiais.getArrayElement(true,BA.numberCast(int.class, _i))),BA.numberCast(int.class, "	TEXT")}, "++",2, 1))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e67) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e67.toString()); };
 }
}Debug.locals.put("i", _i);
;
 break;
case 1:
 BA.debugLineNum = 136;BA.debugLine="For i = 0 To Campos_Tab_Parametros.Length -1";
Debug.ShouldStop(128);
{
final int step70 = 1;
final int limit70 = RemoteObject.solve(new RemoteObject[] {db._campos_tab_parametros.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step70 > 0 && _i <= limit70) || (step70 < 0 && _i >= limit70); _i = ((int)(0 + _i + step70))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 137;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 138;BA.debugLine="SQL.ExecNonQuery(\"ALTER TABLE tab_parametros ADD \" + Campos_Tab_Parametros(i) + \" TEXT\")";
Debug.ShouldStop(512);
db._sql.runVoidMethod ("ExecNonQuery",(Object)(BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(int.class, "ALTER TABLE tab_parametros ADD "),BA.numberCast(int.class, db._campos_tab_parametros.getArrayElement(true,BA.numberCast(int.class, _i))),BA.numberCast(int.class, " TEXT")}, "++",2, 1))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e74) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e74.toString()); };
 }
}Debug.locals.put("i", _i);
;
 break;
case 2:
 BA.debugLineNum = 147;BA.debugLine="For i = 0 To Campos_Tab_Cliente.Length -1";
Debug.ShouldStop(262144);
{
final int step77 = 1;
final int limit77 = RemoteObject.solve(new RemoteObject[] {db._campos_tab_cliente.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step77 > 0 && _i <= limit77) || (step77 < 0 && _i >= limit77); _i = ((int)(0 + _i + step77))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 148;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 149;BA.debugLine="SQL.ExecNonQuery(\"ALTER TABLE tab_cliente ADD \" + Campos_Tab_Cliente(i) + \" TEXT\")";
Debug.ShouldStop(1048576);
db._sql.runVoidMethod ("ExecNonQuery",(Object)(BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(int.class, "ALTER TABLE tab_cliente ADD "),BA.numberCast(int.class, db._campos_tab_cliente.getArrayElement(true,BA.numberCast(int.class, _i))),BA.numberCast(int.class, " TEXT")}, "++",2, 1))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e81) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e81.toString()); };
 }
}Debug.locals.put("i", _i);
;
 break;
case 3:
 BA.debugLineNum = 158;BA.debugLine="For i = 0 To Campos_Tab_Estoque.Length -1";
Debug.ShouldStop(536870912);
{
final int step84 = 1;
final int limit84 = RemoteObject.solve(new RemoteObject[] {db._campos_tab_estoque.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step84 > 0 && _i <= limit84) || (step84 < 0 && _i >= limit84); _i = ((int)(0 + _i + step84))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 159;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
try { BA.debugLineNum = 160;BA.debugLine="SQL.ExecNonQuery(\"ALTER TABLE tab_estoque ADD \" + Campos_Tab_Estoque(i) + \" TEXT\")";
Debug.ShouldStop(-2147483648);
db._sql.runVoidMethod ("ExecNonQuery",(Object)(BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(int.class, "ALTER TABLE tab_estoque ADD "),BA.numberCast(int.class, db._campos_tab_estoque.getArrayElement(true,BA.numberCast(int.class, _i))),BA.numberCast(int.class, " TEXT")}, "++",2, 1))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e88) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e88.toString()); };
 }
}Debug.locals.put("i", _i);
;
 break;
case 4:
 BA.debugLineNum = 169;BA.debugLine="For i = 0 To Campos_Tab_Contas_Receber.Length -1";
Debug.ShouldStop(256);
{
final int step91 = 1;
final int limit91 = RemoteObject.solve(new RemoteObject[] {db._campos_tab_contas_receber.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step91 > 0 && _i <= limit91) || (step91 < 0 && _i >= limit91); _i = ((int)(0 + _i + step91))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 170;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 171;BA.debugLine="SQL.ExecNonQuery(\"ALTER TABLE tab_contas_receber ADD \" + Campos_Tab_Contas_Receber(i) + \" TEXT\")";
Debug.ShouldStop(1024);
db._sql.runVoidMethod ("ExecNonQuery",(Object)(BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(int.class, "ALTER TABLE tab_contas_receber ADD "),BA.numberCast(int.class, db._campos_tab_contas_receber.getArrayElement(true,BA.numberCast(int.class, _i))),BA.numberCast(int.class, " TEXT")}, "++",2, 1))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e95) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e95.toString()); };
 }
}Debug.locals.put("i", _i);
;
 break;
case 5:
 BA.debugLineNum = 180;BA.debugLine="For i = 0 To Campos_Tab_Pedido.Length -1";
Debug.ShouldStop(524288);
{
final int step98 = 1;
final int limit98 = RemoteObject.solve(new RemoteObject[] {db._campos_tab_pedido.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step98 > 0 && _i <= limit98) || (step98 < 0 && _i >= limit98); _i = ((int)(0 + _i + step98))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 181;BA.debugLine="Try";
Debug.ShouldStop(1048576);
try { BA.debugLineNum = 182;BA.debugLine="SQL.ExecNonQuery(\"ALTER TABLE tab_pedido ADD \" + Campos_Tab_Pedido(i) + \" TEXT\")";
Debug.ShouldStop(2097152);
db._sql.runVoidMethod ("ExecNonQuery",(Object)(BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(int.class, "ALTER TABLE tab_pedido ADD "),BA.numberCast(int.class, db._campos_tab_pedido.getArrayElement(true,BA.numberCast(int.class, _i))),BA.numberCast(int.class, " TEXT")}, "++",2, 1))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e102) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e102.toString()); };
 }
}Debug.locals.put("i", _i);
;
 break;
case 6:
 BA.debugLineNum = 191;BA.debugLine="For i = 0 To Campos_Tab_Prod_Pedido.Length -1";
Debug.ShouldStop(1073741824);
{
final int step105 = 1;
final int limit105 = RemoteObject.solve(new RemoteObject[] {db._campos_tab_prod_pedido.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step105 > 0 && _i <= limit105) || (step105 < 0 && _i >= limit105); _i = ((int)(0 + _i + step105))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 192;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 193;BA.debugLine="SQL.ExecNonQuery(\"ALTER TABLE tab_prod_pedido ADD \" + Campos_Tab_Prod_Pedido(i) + \" TEXT\")";
Debug.ShouldStop(1);
db._sql.runVoidMethod ("ExecNonQuery",(Object)(BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(int.class, "ALTER TABLE tab_prod_pedido ADD "),BA.numberCast(int.class, db._campos_tab_prod_pedido.getArrayElement(true,BA.numberCast(int.class, _i))),BA.numberCast(int.class, " TEXT")}, "++",2, 1))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e109) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e109.toString()); };
 }
}Debug.locals.put("i", _i);
;
 break;
case 7:
 BA.debugLineNum = 202;BA.debugLine="For i = 0 To Campos_Tab_Visita.Length -1";
Debug.ShouldStop(512);
{
final int step112 = 1;
final int limit112 = RemoteObject.solve(new RemoteObject[] {db._campos_tab_visita.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step112 > 0 && _i <= limit112) || (step112 < 0 && _i >= limit112); _i = ((int)(0 + _i + step112))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 203;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 204;BA.debugLine="SQL.ExecNonQuery(\"ALTER TABLE tab_visita ADD \" + Campos_Tab_Visita(i) + \" TEXT\")";
Debug.ShouldStop(2048);
db._sql.runVoidMethod ("ExecNonQuery",(Object)(BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(int.class, "ALTER TABLE tab_visita ADD "),BA.numberCast(int.class, db._campos_tab_visita.getArrayElement(true,BA.numberCast(int.class, _i))),BA.numberCast(int.class, " TEXT")}, "++",2, 1))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e116) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e116.toString()); };
 }
}Debug.locals.put("i", _i);
;
 break;
}
;
 }
}Debug.locals.put("i", _i);
;
 }else 
{ BA.debugLineNum = 214;BA.debugLine="Else If Operacao = 2 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_operacao,BA.numberCast(double.class, 2))) { 
 }};
 BA.debugLineNum = 219;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
}