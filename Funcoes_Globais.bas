Type=StaticCode
Version=3
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Public xx(5) As String

	For i = 0 To 5-1
		xx(i) = "Item " & i
	Next
	
	Return xx
End Sub


