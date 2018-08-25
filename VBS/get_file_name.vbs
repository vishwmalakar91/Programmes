Set objFSO = CreateObject("Scripting.FileSystemObject")
objStartFolder = "C:\Users\vishw\OneDrive\Documents"

Set objFolder = objFSO.GetFolder(objStartFolder)

Set colFiles = objFolder.Files

For Each objFile in colFiles

    Wscript.Echo objFile.Name

Next