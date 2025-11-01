Get-ChildItem -Recurse -Filter *.java | Select-Object -ExpandProperty FullName | Where-Object { $_.Trim() -ne "" } | Set-Content sources.txt
cmd /c "javac -d . @sources.txt"