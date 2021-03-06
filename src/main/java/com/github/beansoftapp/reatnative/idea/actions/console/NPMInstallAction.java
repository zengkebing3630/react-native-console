package com.github.beansoftapp.reatnative.idea.actions.console;

import com.github.beansoftapp.reatnative.idea.actions.BaseRNConsoleNPMAction;
import com.github.beansoftapp.reatnative.idea.icons.PluginIcons;
import com.github.beansoftapp.reatnative.idea.views.ReactNativeConsole;

// NPM Run start Task
public class NPMInstallAction extends BaseRNConsoleNPMAction {
    public NPMInstallAction(ReactNativeConsole terminal) {
        super(terminal, "npm install", "npm install dependencies", PluginIcons.Install);
    }

    @Override
    protected String command() {
        return "npm install";
    }
}
