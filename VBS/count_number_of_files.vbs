Option Explicit  
'On Error Resume Next

Dim strDirectory, nThreshold, NumberOfFiles, extension, msgtext  
Dim objFSO, objFolder, objFile, Logfile  

'file extension to look for
extension = "txt"  

'directory to look in
strDirectory = "C:\Users\vishw\OneDrive\Documents"  

NumberOfFiles = 0  

Set objFSO = CreateObject("Scripting.FileSystemObject")  
Set objFolder = objFSO.GetFolder(strDirectory)  

For Each objFile In objFolder.Files  
	if LCase((objFSO.GetExtensionName(objFile))) = LCase(extension) then  
		NumberOfFiles = NumberOfFiles + 1  
	end if  
Next  

msgbox("The number of txt files in " & strDirectory & " is: " & NumberOfFiles) 