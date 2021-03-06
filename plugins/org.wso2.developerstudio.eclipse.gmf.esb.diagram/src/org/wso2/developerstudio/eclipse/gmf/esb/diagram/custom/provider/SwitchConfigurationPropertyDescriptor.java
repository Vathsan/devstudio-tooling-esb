package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.provider;

import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.wso2.developerstudio.eclipse.gmf.esb.SwitchMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.configure.ui.ConfigureSwitchMediatorDialog;

public class SwitchConfigurationPropertyDescriptor extends PropertyDescriptor {

    public SwitchConfigurationPropertyDescriptor(Object object, IItemPropertyDescriptor itemPropertyDescriptor) {
        super(object, itemPropertyDescriptor);
    }

    public CellEditor createPropertyEditor(Composite parent) {
        return new ExtendedDialogCellEditor(parent, getLabelProvider()) {

            protected Object openDialogBox(Control cellEditorWindow) {
                Shell shell = Display.getDefault().getActiveShell();
                SwitchMediator switchMediator = (SwitchMediator) object;
                // .getEditingDomain()
                ConfigureSwitchMediatorDialog switchMediatorConfigurationDialog = new ConfigureSwitchMediatorDialog(
                        shell, switchMediator);
                switchMediatorConfigurationDialog.setBlockOnOpen(true);
                switchMediatorConfigurationDialog.open();
                return null;
            }
        };
    }

}
