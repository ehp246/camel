/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.stub;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.component.vm.VmEndpointConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class StubEndpointConfigurer extends VmEndpointConfigurer implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        StubEndpoint target = (StubEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        default: return super.configure(camelContext, obj, name, value, ignoreCase);
        }
    }

}
