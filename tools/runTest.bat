@echo on
for /F %%a in ('dir /b *UnitTest*.dll') do set dll=%%~na
echo %dll%
start cmd /k ""C:\Program Files (x86)\Microsoft Visual Studio\2017\Enterprise\Common7\IDE\CommonExtensions\Microsoft\TestWindow\vstest.console.exe" %dll%.dll"