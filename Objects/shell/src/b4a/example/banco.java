
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class banco implements IRemote{
	public static banco mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;

	public banco() {
		mostCurrent = this;
	}
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]));
		RDebug.INSTANCE.waitForTask();

	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
		pcBA = new PCBA(this, banco.class, processBA);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _edittext1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edittext2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edittext3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edittext4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btn_criar_tabela = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btn_criar_campo = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btn_deletar_tabela = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btn_deletar_campo = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static b4a.example.main _main = null;
public static b4a.example.db _db = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",banco.mostCurrent._activity,"Btn_Criar_Campo",banco.mostCurrent._btn_criar_campo,"Btn_Criar_Tabela",banco.mostCurrent._btn_criar_tabela,"Btn_Deletar_Campo",banco.mostCurrent._btn_deletar_campo,"Btn_Deletar_Tabela",banco.mostCurrent._btn_deletar_tabela,"Db",Debug.moduleToString(b4a.example.db.class),"EditText1",banco.mostCurrent._edittext1,"EditText2",banco.mostCurrent._edittext2,"EditText3",banco.mostCurrent._edittext3,"EditText4",banco.mostCurrent._edittext4,"Main",Debug.moduleToString(b4a.example.main.class)};
}
}