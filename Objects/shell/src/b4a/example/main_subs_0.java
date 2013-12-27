package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent);
try {
RemoteObject _contador = RemoteObject.createImmutable("");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 37;BA.debugLine="Activity.LoadLayout(\"Layout1\")";
Debug.ShouldStop(16);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(BA.ObjectToString("Layout1")),main.mostCurrent.activityBA);
 BA.debugLineNum = 39;BA.debugLine="Db.Verifica_Banco() 'Inicializa toda rotina do banco de dados, verificando a integridade e atualização de tabelas e campos.";
Debug.ShouldStop(64);
main.mostCurrent._db.runVoidMethod ("_verifica_banco",main.mostCurrent.activityBA);
 BA.debugLineNum = 41;BA.debugLine="Dim contador As String";
Debug.ShouldStop(256);
_contador = RemoteObject.createImmutable("");Debug.locals.put("contador", _contador);
 BA.debugLineNum = 44;BA.debugLine="Db.C = Db.SQL.ExecQuery(\"SELECT contador_ajuste FROM tab_parametros\")";
Debug.ShouldStop(2048);
main.mostCurrent._db._c.setObject(main.mostCurrent._db._sql.runMethod(false,"ExecQuery",(Object)(BA.ObjectToString("SELECT contador_ajuste FROM tab_parametros"))));
 BA.debugLineNum = 45;BA.debugLine="Db.C.Position = 0";
Debug.ShouldStop(4096);
main.mostCurrent._db._c.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 47;BA.debugLine="If Db.C <> Db.Contador_Ajuste Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("!",main.mostCurrent._db._c,main.mostCurrent._db._contador_ajuste)) { 
 BA.debugLineNum = 48;BA.debugLine="Db.Cria_Tabelas(1,\"\")";
Debug.ShouldStop(32768);
main.mostCurrent._db.runVoidMethod ("_cria_tabelas",main.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 1)),(Object)(BA.ObjectToString("")));
 BA.debugLineNum = 49;BA.debugLine="Db.Verifica_Campos(1,\"\")";
Debug.ShouldStop(65536);
main.mostCurrent._db.runVoidMethod ("_verifica_campos",main.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 1)),(Object)(BA.ObjectToString("")));
 BA.debugLineNum = 50;BA.debugLine="contador = Db.Contador_Ajuste";
Debug.ShouldStop(131072);
_contador = BA.NumberToString(main.mostCurrent._db._contador_ajuste);Debug.locals.put("contador", _contador);
 BA.debugLineNum = 51;BA.debugLine="Db.SQL.ExecNonQuery(\"UPDATE tab_parametros SET contador_ajuste = \" & contador & \"\")";
Debug.ShouldStop(262144);
main.mostCurrent._db._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE tab_parametros SET contador_ajuste = "),_contador,RemoteObject.createImmutable(""))));
 BA.debugLineNum = 52;BA.debugLine="ToastMessageShow(Db.C.Position, True)";
Debug.ShouldStop(524288);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.NumberToString(main.mostCurrent._db._c.runMethod(true,"getPosition"))),(Object)(main.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent);
try {
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 61;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent);
try {
 BA.debugLineNum = 57;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16777216);
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
public static RemoteObject  _btn_click() throws Exception{
		Debug.PushSubsStack("btn_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent);
try {
int _i = 0;
 BA.debugLineNum = 65;BA.debugLine="Sub btn_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 68;BA.debugLine="Db.SQL.ExecNonQuery(\"INSERT INTO tab_filiais VALUES('abc','\" & txt.Text & \"')\")";
Debug.ShouldStop(8);
main.mostCurrent._db._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO tab_filiais VALUES('abc','"),main.mostCurrent._txt.runMethodAndSync(true,"getText"),RemoteObject.createImmutable("')"))));
 BA.debugLineNum = 70;BA.debugLine="If Db.C.RowCount > 0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",main.mostCurrent._db._c.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 71;BA.debugLine="For i = 0 To Db.C.RowCount - 1";
Debug.ShouldStop(64);
{
final int step30 = 1;
final int limit30 = RemoteObject.solve(new RemoteObject[] {main.mostCurrent._db._c.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step30 > 0 && _i <= limit30) || (step30 < 0 && _i >= limit30); _i = ((int)(0 + _i + step30))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 72;BA.debugLine="Db.C.Position = i";
Debug.ShouldStop(128);
main.mostCurrent._db._c.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 73;BA.debugLine="lv.AddSingleLine(Db.C.GetString(\"nreg\"))";
Debug.ShouldStop(256);
main.mostCurrent._lv.runVoidMethod ("AddSingleLine",(Object)(main.mostCurrent._db._c.runMethod(true,"GetString",(Object)(BA.ObjectToString("nreg")))));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent);
try {
 BA.debugLineNum = 82;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="StartActivity(\"Banco\")";
Debug.ShouldStop(262144);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable(("Banco"))));
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
db_subs_0._process_globals();
banco_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
db.myClass = BA.getDeviceClass ("b4a.example.db");
banco.myClass = BA.getDeviceClass ("b4a.example.banco");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 24;BA.debugLine="Dim s As SQL";
main.mostCurrent._s = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 25;BA.debugLine="Dim c As Cursor";
main.mostCurrent._c = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Dim txt As EditText";
main.mostCurrent._txt = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Dim btn As Button";
main.mostCurrent._btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Dim lv As ListView";
main.mostCurrent._lv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}