Public Class Form1
Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As
System.EventArgs) Handles Button1.Click
TextBox3.Text = projectdll.add(Val(TextBox1.Text),
Val(TextBox2.Text)) End Sub
Private Sub Button2_Click(ByVal sender As System.Object, ByVal e As
System.EventArgs) Handles Button2.Click
TextBox3.Text = projectdll.sub1(Val(TextBox1.Text),
Val(TextBox2.Text)) End Sub
Private Sub Button3_Click(ByVal sender As System.Object, ByVal e As
System.EventArgs) Handles Button3.Click
TextBox3.Text = projectdll.mul(Val(TextBox1.Text),
Val(TextBox2.Text)) End Sub
Private Sub Button4_Click(ByVal sender As System.Object, ByVal e As
System.EventArgs) Handles Button4.Click
TextBox3.Text = projectdll.div(Val(TextBox1.Text),
Val(TextBox2.Text)) End Sub
Private Sub Button5_Click(ByVal sender As System.Object, ByVal e As
System.EventArgs) Handles Button5.Click
Me.Close() End Sub
End Class