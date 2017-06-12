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
import edu.stanford.smi.protegex.owl.model.RDFSLiteral;
import edu.stanford.smi.protegex.owl.model.impl.DefaultRDFIndividual;
import edu.stanford.smi.protegex.owlx.examples.javaDemo.model.Customer;
import edu.stanford.smi.protegex.owlx.examples.javaDemo.model.Product;
import edu.stanford.smi.protegex.owlx.examples.javaDemo.model.Purchase;

/**
 * Generated by Protege-OWL  (http://protege.stanford.edu/plugins/owl).
 * Source OWL Class: http://www.owl-ontologies.com/javaDemo.owl#Purchase
 *
 * @version generated on Mon Feb 21 10:53:08 EST 2005
 */
public class DefaultPurchase extends DefaultRDFIndividual
        implements Purchase {

    public DefaultPurchase(OWLModel owlModel, FrameID id) {
        super(owlModel, id);
    }


    public DefaultPurchase() {
    }

    // Property http://www.owl-ontologies.com/javaDemo.owl#customer


    public Customer getCustomer() {
        return (Customer) getPropertyValueAs(getCustomerProperty(), Customer.class);
    }


    public RDFProperty getCustomerProperty() {
        final String uri = "http://www.owl-ontologies.com/javaDemo.owl#customer";
        final String name = getOWLModel().getResourceNameForURI(uri);
        return getOWLModel().getRDFProperty(name);
    }


    public boolean hasCustomer() {
        return getPropertyValueCount(getCustomerProperty()) > 0;
    }


    public void setCustomer(Customer newCustomer) {
        setPropertyValue(getCustomerProperty(), newCustomer);
    }

    // Property http://www.owl-ontologies.com/javaDemo.owl#date


    public RDFSLiteral getDate() {
        return (RDFSLiteral) getPropertyValue(getDateProperty());
    }


    public RDFProperty getDateProperty() {
        final String uri = "http://www.owl-ontologies.com/javaDemo.owl#date";
        final String name = getOWLModel().getResourceNameForURI(uri);
        return getOWLModel().getRDFProperty(name);
    }


    public boolean hasDate() {
        return getPropertyValueCount(getDateProperty()) > 0;
    }


    public void setDate(RDFSLiteral newDate) {
        setPropertyValue(getDateProperty(), newDate);
    }

    // Property http://www.owl-ontologies.com/javaDemo.owl#product


    public Product getProduct() {
        return (Product) getPropertyValueAs(getProductProperty(), Product.class);
    }


    public RDFProperty getProductProperty() {
        final String uri = "http://www.owl-ontologies.com/javaDemo.owl#product";
        final String name = getOWLModel().getResourceNameForURI(uri);
        return getOWLModel().getRDFProperty(name);
    }


    public boolean hasProduct() {
        return getPropertyValueCount(getProductProperty()) > 0;
    }


    public void setProduct(Product newProduct) {
        setPropertyValue(getProductProperty(), newProduct);
    }
}