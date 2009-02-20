package org.eclipse.imp.test.except;

import org.eclipse.imp.runtime.PluginBase;
import org.osgi.framework.BundleContext;

public class Activator extends PluginBase {
    public static final String kPluginID= "org.eclipse.imp.test.except";
    public static final String kLanguageID= "except";

    /**
     * The unique instance of this plugin class
     */
    protected static Activator sPlugin;

    public static Activator getInstance() {
        if (sPlugin == null) {
            new Activator();
        }
        return sPlugin;
    }

    public Activator() {
        super();
        sPlugin= this;
    }

    public void start(BundleContext context) throws Exception {
        super.start(context);

    }

    public String getID() {
        return kPluginID;
    }

    @Override
    public String getLanguageID() {
        return kLanguageID;
    }

    // Definitions for image management

    public static final org.eclipse.core.runtime.IPath ICONS_PATH= new org.eclipse.core.runtime.Path("icons/"); //$NON-NLS-1$("icons/"); //$NON-NLS-1$

    protected void initializeImageRegistry(org.eclipse.jface.resource.ImageRegistry reg) {
        org.eclipse.core.runtime.IPath path= ICONS_PATH.append("except_default_image.gif");//$NON-NLS-1$
        org.eclipse.jface.resource.ImageDescriptor imageDescriptor= createImageDescriptor(getInstance().getBundle(), path);
        reg.put(IExceptResources.EXCEPT_DEFAULT_IMAGE, imageDescriptor);

        path= ICONS_PATH.append("except_default_outline_item.gif");//$NON-NLS-1$
        imageDescriptor= createImageDescriptor(getInstance().getBundle(), path);
        reg.put(IExceptResources.EXCEPT_DEFAULT_OUTLINE_ITEM, imageDescriptor);

        path= ICONS_PATH.append("except_file.gif");//$NON-NLS-1$
        imageDescriptor= createImageDescriptor(getInstance().getBundle(), path);
        reg.put(IExceptResources.EXCEPT_FILE, imageDescriptor);

        path= ICONS_PATH.append("except_file_warning.gif");//$NON-NLS-1$
        imageDescriptor= createImageDescriptor(getInstance().getBundle(), path);
        reg.put(IExceptResources.EXCEPT_FILE_WARNING, imageDescriptor);

        path= ICONS_PATH.append("except_file_error.gif");//$NON-NLS-1$
        imageDescriptor= createImageDescriptor(getInstance().getBundle(), path);
        reg.put(IExceptResources.EXCEPT_FILE_ERROR, imageDescriptor);
    }

    public static org.eclipse.jface.resource.ImageDescriptor createImageDescriptor(org.osgi.framework.Bundle bundle, org.eclipse.core.runtime.IPath path) {
        java.net.URL url= org.eclipse.core.runtime.FileLocator.find(bundle, path, null);
        if (url != null) {
            return org.eclipse.jface.resource.ImageDescriptor.createFromURL(url);
        }
        return null;
    }
}
