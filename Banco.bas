Type=Activity
Version=3
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
'	Dim s As SQL
'	Dim c As Cursor
	
	Dim EditText1 As EditText
	Dim EditText2 As EditText
	Dim EditText3 As EditText
	Dim EditText4 As EditText
	Dim Btn_Criar_Tabela As Button
	Dim Btn_Criar_Campo As Button
	Dim Btn_Deletar_Tabela As Button
	Dim Btn_Deletar_Campo As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("Banco")

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Btn_Criar_Tabela_Click
	
	Try
		Db.SQL.ExecNonQuery("CREATE TABLE " & EditText1.Text & "(nome TEXT)")
		Catch
		Msgbox("erro","erro")
	End Try

End Sub
Sub Btn_Criar_Campo_Click
	Db.SQL.ExecNonQuery("ALTER TABLE " & EditText2.Text & " ADD campo&&)")
End Sub
Sub Btn_Deletar_Tabela_Click
	Db.SQL.ExecNonQuery("DROP TABLE " & EditText3.Text)
End Sub
Sub Btn_Deletar_Campo_Click
	Db.SQL.ExecNonQuery("INSERT INTO tab_filiais (rowid,nome) VALUES(NULL,?)")
End Sub

