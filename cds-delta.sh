#!/bin/sh
BASE_DIR=~/.vscode/extensions
SCRIPT_PATH=$(find "$BASE_DIR" -type f -name "cds-delta.sh" 2>/dev/null | grep sapse.vsc-extension-mbt | grep server-odata-sdk | head -n 1)
if [ -z "$SCRIPT_PATH" ]; then
    SCRIPT_PATH=$(find "/extbin/local/openvscode-server/extensions" -type f -name "cds-delta.sh" 2>/dev/null | grep vsc-extension-mbt | grep server-odata-sdk | head -n 1)
    if [ -z "$SCRIPT_PATH" ]; then
        echo "cds-delta.sh not found under $BASE_DIR"
        exit 1
    fi
fi
/bin/sh "$SCRIPT_PATH" $*
