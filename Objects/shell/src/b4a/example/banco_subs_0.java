package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class banco_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
		Debug.PushSubsStack("Activity_Create (banco) ","banco",2,banco.mostCurrent.activityBA,banco.mostCurrent);
try {
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="Activity.LoadLayout(\"Banco\")";
Debug.ShouldStop(536870912);
banco.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(BA.ObjectToString("Banco")),banco.mostCurrent.activityBA);
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
		Debug.PushSubsStack("Activity_Pause (banco) ","banco",2,banco.mostCurrent.activityBA,banco.mostCurrent);
try {
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
		Debug.PushSubsStack("Activity_Resume (banco) ","banco",2,banco.mostCurrent.activityBA,banco.mostCurrent);
try {
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_criar_campo_click() throws Exception{
		Debug.PushSubsStack("Btn_Criar_Campo_Click (banco) ","banco",2,banco.mostCurrent.activityBA,banco.mostCurrent);
try {
 BA.debugLineNum = 51;BA.debugLine="Sub Btn_Criar_Campo_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="Db.SQL.ExecNonQuery(\"ALTER TABLE \" & EditText2.Text & \" ADD campo&&)\")";
Debug.ShouldStop(524288);
banco.mostCurrent._db._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ALTER TABLE "),banco.mostCurrent._edittext2.runMethodAndSync(true,"getText"),RemoteObject.createImmutable(" ADD campo&&)"))));
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_criar_tabela_click() throws Exception{
		Debug.PushSubsStack("Btn_Criar_Tabela_Click (banco) ","banco",2,banco.mostCurrent.activityBA,banco.mostCurrent);
try {
 BA.debugLineNum = 42;BA.debugLine="Sub Btn_Criar_Tabela_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 44;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 45;BA.debugLine="Db.SQL.ExecNonQuery(\"CREATE TABLE \" & EditText1.Text & \"(nome TEXT)\")";
Debug.ShouldStop(4096);
banco.mostCurrent._db._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE "),banco.mostCurrent._edittext1.runMethodAndSync(true,"getText"),RemoteObject.createImmutable("(nome TEXT)"))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e23) {
			BA.rdebugUtils.runVoidMethod("setLastException",banco.processBA, e23.toString()); BA.debugLineNum = 47;BA.debugLine="Msgbox(\"erro\",\"erro\")";
Debug.ShouldStop(16384);
banco.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("erro")),(Object)(BA.ObjectToString("erro")),banco.mostCurrent.activityBA);
 };
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_deletar_campo_click() throws Exception{
		Debug.PushSubsStack("Btn_Deletar_Campo_Click (banco) ","banco",2,banco.mostCurrent.activityBA,banco.mostCurrent);
try {
 BA.debugLineNum = 57;BA.debugLine="Sub Btn_Deletar_Campo_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="Db.SQL.ExecNonQuery(\"INSERT INTO tab_filiais (rowid,nome) VALUES(NULL,?)\")";
Debug.ShouldStop(33554432);
banco.mostCurrent._db._sql.runVoidMethod ("ExecNonQuery",(Object)(BA.ObjectToString("INSERT INTO tab_filiais (rowid,nome) VALUES(NULL,?)")));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
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
public static RemoteObject  _btn_deletar_tabela_click() throws Exception{
		Debug.PushSubsStack("Btn_Deletar_Tabela_Click (banco) ","banco",2,banco.mostCurrent.activityBA,banco.mostCurrent);
try {
 BA.debugLineNum = 54;BA.debugLine="Sub Btn_Deletar_Tabela_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="Db.SQL.ExecNonQuery(\"DROP TABLE \" & EditText3.Text)";
Debug.ShouldStop(4194304);
banco.mostCurrent._db._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("DROP TABLE "),banco.mostCurrent._edittext3.runMethodAndSync(true,"getText"))));
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 18;BA.debugLine="Dim EditText1 As EditText";
banco.mostCurrent._edittext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Dim EditText2 As EditText";
banco.mostCurrent._edittext2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Dim EditText3 As EditText";
banco.mostCurrent._edittext3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim EditText4 As EditText";
banco.mostCurrent._edittext4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Dim Btn_Criar_Tabela As Button";
banco.mostCurrent._btn_criar_tabela = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Dim Btn_Criar_Campo As Button";
banco.mostCurrent._btn_criar_campo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Dim Btn_Deletar_Tabela As Button";
banco.mostCurrent._btn_deletar_tabela = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Dim Btn_Deletar_Campo As Button";
banco.mostCurrent._btn_deletar_campo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}