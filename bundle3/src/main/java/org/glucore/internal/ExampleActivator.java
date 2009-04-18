package org.glucore.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import org.glucore.bundle1.use.*;
import org.glucore.bundle2.use.*;

/**
 * Extension of the default OSGi bundle activator
 */
public final class ExampleActivator
    implements BundleActivator
{
    /**
     * Called whenever the OSGi framework starts our bundle
     */
    public void start( BundleContext bc )
        throws Exception
    {
        System.out.println( "STARTING org.glucore.test-recursion" );
	new org.glucore.bundle1.use.UseBundle2().use();
	new org.glucore.bundle2.use.UseBundle1().use();

    }

    /**
     * Called whenever the OSGi framework stops our bundle
     */
    public void stop( BundleContext bc )
        throws Exception
    {
        System.out.println( "STOPPING org.glucore.test-recursion" );
    }
}

