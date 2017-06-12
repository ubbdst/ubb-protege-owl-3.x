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

package edu.stanford.smi.protegex.owl.ui.metadatatab.imports.wizard;

import edu.stanford.smi.protegex.owl.repository.Repository;

import java.net.URI;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/**
 * User: matthewhorridge<br>
 * The University Of Manchester<br>
 * Medical Informatics Group<br>
 * Date: Dec 7, 2005<br><br>
 * <p/>
 * matthew.horridge@cs.man.ac.uk<br>
 * www.cs.man.ac.uk/~horridgm<br><br>
 */
public abstract class AbstractImportEntry implements ImportEntry {

	private Collection errors;

	private URI ontologyURI;

	private Repository repository;

	public AbstractImportEntry() {
		errors = new HashSet();
	}

	protected void clearErrors() {
		errors.clear();
	}

	protected void addError(Object error) {
		errors.add(error);
	}

	public Collection getErrors() {
		return Collections.unmodifiableCollection(errors);
	}


	public URI getOntologyURI() {
		return ontologyURI;
	}


	protected void setOntologyURI(URI ontologyURI) {
		this.ontologyURI = ontologyURI;
	}


	public Repository getRepository() {
		return repository;
	}


	protected void setRepository(Repository repository) {
		this.repository = repository;
	}
}
