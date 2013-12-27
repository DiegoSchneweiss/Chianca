
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class db implements IRemote{
	public static db mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;

	public db() {
		mostCurrent = this;
	}
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new db();
	}
    private static PCBA pcBA = new PCBA(null, db.class, null);
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public PCBA create(Object[] args) throws ClassNotFoundException{
        throw new RuntimeException("CREATE is not supported.");
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _sql = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _c = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
public static RemoteObject _contador_ajuste = RemoteObject.createImmutable(0);
public static RemoteObject _nome_tabela = null;
public static RemoteObject _campos_tab_filiais = null;
public static RemoteObject _campos_tab_parametros = null;
public static RemoteObject _campos_tab_cliente = null;
public static RemoteObject _campos_tab_estoque = null;
public static RemoteObject _campos_tab_contas_receber = null;
public static RemoteObject _campos_tab_pedido = null;
public static RemoteObject _campos_tab_prod_pedido = null;
public static RemoteObject _campos_tab_visita = null;
public static b4a.example.main _main = null;
public static b4a.example.banco _banco = null;
  public Object[] GetGlobals() {
		return new Object[] {"Banco",Debug.moduleToString(b4a.example.banco.class),"C",db._c,"Campos_Tab_Cliente",db._campos_tab_cliente,"Campos_Tab_Contas_Receber",db._campos_tab_contas_receber,"Campos_Tab_Estoque",db._campos_tab_estoque,"Campos_Tab_Filiais",db._campos_tab_filiais,"Campos_Tab_Parametros",db._campos_tab_parametros,"Campos_Tab_Pedido",db._campos_tab_pedido,"Campos_Tab_Prod_Pedido",db._campos_tab_prod_pedido,"Campos_Tab_Visita",db._campos_tab_visita,"Contador_Ajuste",db._contador_ajuste,"Main",Debug.moduleToString(b4a.example.main.class),"Nome_Tabela",db._nome_tabela,"SQL",db._sql};
}
}