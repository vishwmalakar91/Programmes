Option Explicit  

Dim FileName,ExcelName,Counter,NumberOfFiles
Dim objExcel,objWorkbook
Dim strDirectory, nThreshold, extension, msgtext  
Dim objFSO, objFolder, objFile, Logfile,colFiles 
Dim CurrentDirectory

Set objFSO = CreateObject("Scripting.FileSystemObject")  

CurrentDirectory = objFSO.GetAbsolutePathName(".") 
MsgBox(CurrentDirectory)
strDirectory=CurrentDirectory
ExcelName="file_list.xlsx"
Counter=1

Set objFolder = objFSO.GetFolder(strDirectory)
set objExcel=CreateObject("Excel.Application")
set objWorkbook=objExcel.workbooks.add()
Set colFiles = objFolder.Files



objExcel.Application.DisplayAlerts=False

For Each objFile in colFiles
objExcel.cells(Counter,1).value=Counter  
objExcel.cells(Counter,2).value=objFile.Name
Counter=Counter+1
Next

objWorkbook.SaveCopyAs(strDirectory&"\file_list.xlsx")
objWorkbook.Close
objExcel.workbooks.Close
objExcel.Quit
MsgBox("Excel file created")
set objExcel=nothing