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
import edu.stanford.smi.protegex.owlx.examples.javaDemo.model.Customer_;
import edu.stanford.smi.protegex.owlx.examples.javaDemo.model.Purchase;

import java.util.Collection;
import java.util.Iterator;

/**
 * Generated by Protege-OWL  (http://protege.stanford.edu/plugins/owl).
 * Source OWL Class: http://www.owl-ontologies.com/javaDemo.owl#Customer
 *
 * @version generated on Sat Feb 19 17:10:28 EST 2005
 */
public class DefaultCustomer_ extends DefaultRDFIndividual
        implements Customer_ {

    public DefaultCustomer_(OWLModel owlModel, FrameID id) {
        super(owlModel, id);
    }


    public DefaultCustomer_() {
    }

    // Property http://www.owl-ontologies.com/javaDemo.owl#firstName


    public String getFirstName() {
        return (String) getPropertyValue(getFirstNameProperty());
    }


    public RDFProperty getFirstNameProperty() {
        final String uri = "http://www.owl-ontologies.com/javaDemo.owl#firstName";
        final String name = getOWLModel().getResourceNameForURI(uri);
        return getOWLModel().getRDFProperty(name);
    }


    public boolean hasFirstName() {
        return getPropertyValueCount(getFirstNameProperty()) > 0;
    }


    public void setFirstName(String newFirstName) {
        setPropertyValue(getFirstNameProperty(), newFirstName);
    }

    // Property http://www.owl-ontologies.com/javaDemo.owl#lastName


    public String getLastName() {
        return (String) getPropertyValue(getLastNameProperty());
    }


    public RDFProperty getLastNameProperty() {
        final String uri = "http://www.owl-ontologies.com/javaDemo.owl#lastName";
        final String name = getOWLModel().getResourceNameForURI(uri);
        return getOWLModel().getRDFProperty(name);
    }


    public boolean hasLastName() {
        return getPropertyValueCount(getLastNameProperty()) > 0;
    }


    public void setLastName(String newLastName) {
        setPropertyValue(getLastNameProperty(), newLastName);
    }

    // Property http://www.owl-ontologies.com/javaDemo.owl#purchases


    public Collection getPurchases() {
        return getPropertyValuesAs(getPurchasesProperty(), Purchase.class);
    }


    public RDFProperty getPurchasesProperty() {
        final String uri = "http://www.owl-ontologies.com/javaDemo.owl#purchases";
        final String name = getOWLModel().getResourceNameForURI(uri);
        return getOWLModel().getRDFProperty(name);
    }


    public boolean hasPurchases() {
        return getPropertyValueCount(getPurchasesProperty()) > 0;
    }


    public Iterator listPurchases() {
        return listPropertyValuesAs(getPurchasesProperty(), Purchase.class);
    }


    public void addPurchases(Purchase newPurchases) {
        addPropertyValue(getPurchasesProperty(), newPurchases);
    }


    public void removePurchases(Purchase oldPurchases) {
        removePropertyValue(getPurchasesProperty(), oldPurchases);
    }


    public void setPurchases(Collection newPurchases) {
        setPropertyValues(getPurchasesProperty(), newPurchases);
    }

    // Property http://www.owl-ontologies.com/javaDemo.owl#zipCode


    public int getZipCode() {
        return getPropertyValueLiteral(getZipCodeProperty()).getInt();
    }


    public RDFProperty getZipCodeProperty() {
        final String uri = "http://www.owl-ontologies.com/javaDemo.owl#zipCode";
        final String name = getOWLModel().getResourceNameForURI(uri);
        return getOWLModel().getRDFProperty(name);
    }


    public boolean hasZipCode() {
        return getPropertyValueCount(getZipCodeProperty()) > 0;
    }


    public void setZipCode(int newZipCode) {
        setPropertyValue(getZipCodeProperty(), new Integer(newZipCode));
    }
}