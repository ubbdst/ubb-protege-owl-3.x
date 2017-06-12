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

package edu.stanford.smi.protegex.owl.ui.results;

import edu.stanford.smi.protegex.owl.model.triplestore.Triple;

import java.awt.*;

/**
 * @author Holger Knublauch  <holger@knublauch.com>
 */
public class TripleDisplayUtil {

    /**
     * Does a simple depth-first traversal into the component tree and asks all
     * of them whether they can display a given Triple, until one of them says Yes.
     *
     * @param comp   the root component of traversal
     * @param triple the Triple to display
     * @return true  if triple could be displayed
     */
    public static TripleDisplay displayTriple(Component comp, Triple triple) {
        if (comp instanceof TripleDisplay && ((TripleDisplay) comp).displayTriple(triple)) {
            return (TripleDisplay) comp;
        }
        if (comp instanceof Container) {
            Container container = (Container) comp;
            for (int i = 0; i < container.getComponentCount(); i++) {
                Component component = container.getComponent(i);
                TripleDisplay tripleDisplay = displayTriple(component, triple);
                if (tripleDisplay != null) {
                    return tripleDisplay;
                }
            }
        }
        return null;
    }
}