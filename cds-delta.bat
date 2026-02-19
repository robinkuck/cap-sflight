@echo off
setlocal enabledelayedexpansion
set BASE_DIR=%USERPROFILE%\.vscode\extensions
set SCRIPT_PATH=
for /d %%D in ("%BASE_DIR%\sapse.vsc-extension-mbt-*") do (
    if exist "%%D\server-odata-sdk\bin\cds-delta.bat" (
        set SCRIPT_PATH=%%D\server-odata-sdk\bin\cds-delta.bat
        goto :found
    )
)
:found
if not defined SCRIPT_PATH (
    echo cds-delta.bat not found under %BASE_DIR%
    exit /b 1
)
"%SCRIPT_PATH%" %*
