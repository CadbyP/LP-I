Project DLL File
Public Module projectdll
Public Function add(ByVal n1 As Integer, ByVal n2 As Integer)
Dim RESULT As String
RESULT = n1 + n2
Return (RESULT)
End Function
End Function
Public Function mul(ByVal n1 As Integer, ByVal n2 As Integer)
Dim RESULT As String
RESULT = n1 * n2
Return (RESULT)
End Function
Public Function div(ByVal n1 As Integer, ByVal n2 As Integer)
Dim RESULT As String
RESULT = n1 / n2
Return (RESULT)
End Function
End Module