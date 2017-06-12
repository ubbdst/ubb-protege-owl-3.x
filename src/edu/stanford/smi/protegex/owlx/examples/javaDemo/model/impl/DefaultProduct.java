/*
 * The contents of this file are subject to the Mozilla Public License
 * Version 1.1 (the "License");  you may not use this file except in 
 * compliance with the License.  You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for
 * the specific language governing rights and limitations under the License.
 *
 * The Original Code is Protege-2000.
 *
 * The Initial Developer of the Original Code is Stanford University. Portions
 * created by Stanford University are Copyright (C) 2007.  All Rights Reserved.
 *
 * Protege was developed by Stanford Medical Informatics
 * (http://www.smi.stanford.edu) at the Stanford University School of Medicine
 * with support from the National Library of Medicine, the National Science
 * Foundation, and the Defense Advanced Research Projects Agency.  Current
 * information about Protege can be obtained at http://protege.stanford.edu.
 *
 */

package edu.stanford.smi.protegex.owlx.examples.javaDemo.model.impl;

import edu.stanford.smi.protege.model.FrameID;
import edu.stanford.smi.protegex.owl.model.OWLModel;
import edu.stanford.smi.protegex.owl.model.RDFProperty;
import edu.stanford.smi.protegex.owl.model.impl.DefaultRDFIndividual;
import edu.stanford.smi.protegex.owlx.examples.javaDemo.model.Product;

/**
 * Generated by Protege-OWL  (http://protege.stanford.edu/plugins/owl).
 * Source OWL Class: http://www.owl-ontologies.com/javaDemo.owl#Product
 *
 * @version generated on Mon Feb 21 10:30:53 EST 2005
 */
public class DefaultProduct extends DefaultRDFIndividual
        implements Product {

    public DefaultProduct(OWLModel owlModel, FrameID id) {
        super(owlModel, id);
    }


    public DefaultProduct() {
    }

    // Property http://www.owl-ontologies.com/javaDemo.owl#price


    public float getPrice() {
        return getPropertyValueLiteral(getPriceProperty()).getFloat();
    }


    public RDFProperty getPriceProperty() {
        final String uri = "http://www.owl-ontologies.com/javaDemo.owl#price";
        final String name = getOWLModel().getResourceNameForURI(uri);
        return getOWLModel().getRDFProperty(name);
    }


    public boolean hasPrice() {
        return getPropertyValueCount(getPriceProperty()) > 0;
    }


    public void setPrice(float newPrice) {
        setPropertyValue(getPriceProperty(), new Float(newPrice));
    }
}