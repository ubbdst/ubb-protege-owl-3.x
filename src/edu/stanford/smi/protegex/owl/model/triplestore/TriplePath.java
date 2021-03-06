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

package edu.stanford.smi.protegex.owl.model.triplestore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * A chain of Triples, so that the object of one Triple is the subject of
 * the next.
 *
 * @author Holger Knublauch  <holger@knublauch.com>
 */
public class TriplePath implements TripleDescriptor {

    private List triples = new ArrayList();


    public TriplePath(Iterator it) {
        while(it.hasNext()) {
            triples.add(it.next());
        }
    }


    public TriplePath(Collection c) {
        this(c.iterator());
    }


    public Triple getFirstTriple() {
        if(triples.isEmpty()) {
            return null;
        }
        else {
            return (Triple) triples.get(0);
        }
    }


    public Triple getLastTriple() {
        if(triples.isEmpty()) {
            return null;
        }
        else {
            return (Triple) triples.get(triples.size() - 1);
        }
    }


    public int getLength() {
        return triples.size();
    }


    public Iterator listTriples() {
        return triples.iterator();
    }
}
