/**
 * Generated with Acceleo
 */
package org.wso2.developerstudio.eclipse.gmf.esb.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import org.wso2.developerstudio.eclipse.gmf.esb.parts.DataServicesCallMediatorOutputConnectorPropertiesEditionPart;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.EsbViewsRepository;

import org.wso2.developerstudio.eclipse.gmf.esb.providers.EsbMessages;

// End of user code

/**
 * 
 * 
 */
public class DataServicesCallMediatorOutputConnectorPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, DataServicesCallMediatorOutputConnectorPropertiesEditionPart {

	protected ReferencesTable commentMediators;
	protected List<ViewerFilter> commentMediatorsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> commentMediatorsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public DataServicesCallMediatorOutputConnectorPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence dataServicesCallMediatorOutputConnectorStep = new BindingCompositionSequence(propertiesEditionComponent);
		dataServicesCallMediatorOutputConnectorStep
			.addStep(EsbViewsRepository.DataServicesCallMediatorOutputConnector.Properties.class)
			.addStep(EsbViewsRepository.DataServicesCallMediatorOutputConnector.Properties.commentMediators);
		
		
		composer = new PartComposer(dataServicesCallMediatorOutputConnectorStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EsbViewsRepository.DataServicesCallMediatorOutputConnector.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EsbViewsRepository.DataServicesCallMediatorOutputConnector.Properties.commentMediators) {
					return createCommentMediatorsAdvancedTableComposition(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(EsbMessages.DataServicesCallMediatorOutputConnectorPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createCommentMediatorsAdvancedTableComposition(Composite parent) {
		this.commentMediators = new ReferencesTable(getDescription(EsbViewsRepository.DataServicesCallMediatorOutputConnector.Properties.commentMediators, EsbMessages.DataServicesCallMediatorOutputConnectorPropertiesEditionPart_CommentMediatorsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataServicesCallMediatorOutputConnectorPropertiesEditionPartImpl.this, EsbViewsRepository.DataServicesCallMediatorOutputConnector.Properties.commentMediators, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				commentMediators.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataServicesCallMediatorOutputConnectorPropertiesEditionPartImpl.this, EsbViewsRepository.DataServicesCallMediatorOutputConnector.Properties.commentMediators, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				commentMediators.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataServicesCallMediatorOutputConnectorPropertiesEditionPartImpl.this, EsbViewsRepository.DataServicesCallMediatorOutputConnector.Properties.commentMediators, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				commentMediators.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataServicesCallMediatorOutputConnectorPropertiesEditionPartImpl.this, EsbViewsRepository.DataServicesCallMediatorOutputConnector.Properties.commentMediators, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				commentMediators.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.commentMediatorsFilters) {
			this.commentMediators.addFilter(filter);
		}
		this.commentMediators.setHelpText(propertiesEditionComponent.getHelpContent(EsbViewsRepository.DataServicesCallMediatorOutputConnector.Properties.commentMediators, EsbViewsRepository.SWT_KIND));
		this.commentMediators.createControls(parent);
		this.commentMediators.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataServicesCallMediatorOutputConnectorPropertiesEditionPartImpl.this, EsbViewsRepository.DataServicesCallMediatorOutputConnector.Properties.commentMediators, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData commentMediatorsData = new GridData(GridData.FILL_HORIZONTAL);
		commentMediatorsData.horizontalSpan = 3;
		this.commentMediators.setLayoutData(commentMediatorsData);
		this.commentMediators.setLowerBound(0);
		this.commentMediators.setUpperBound(-1);
		commentMediators.setID(EsbViewsRepository.DataServicesCallMediatorOutputConnector.Properties.commentMediators);
		commentMediators.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createCommentMediatorsAdvancedTableComposition

		// End of user code
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.DataServicesCallMediatorOutputConnectorPropertiesEditionPart#initCommentMediators(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initCommentMediators(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		commentMediators.setContentProvider(contentProvider);
		commentMediators.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.DataServicesCallMediatorOutputConnector.Properties.commentMediators);
		if (eefElementEditorReadOnlyState && commentMediators.isEnabled()) {
			commentMediators.setEnabled(false);
			commentMediators.setToolTipText(EsbMessages.DataServicesCallMediatorOutputConnector_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !commentMediators.isEnabled()) {
			commentMediators.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.DataServicesCallMediatorOutputConnectorPropertiesEditionPart#updateCommentMediators()
	 * 
	 */
	public void updateCommentMediators() {
	commentMediators.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.DataServicesCallMediatorOutputConnectorPropertiesEditionPart#addFilterCommentMediators(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCommentMediators(ViewerFilter filter) {
		commentMediatorsFilters.add(filter);
		if (this.commentMediators != null) {
			this.commentMediators.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.DataServicesCallMediatorOutputConnectorPropertiesEditionPart#addBusinessFilterCommentMediators(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCommentMediators(ViewerFilter filter) {
		commentMediatorsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.DataServicesCallMediatorOutputConnectorPropertiesEditionPart#isContainedInCommentMediatorsTable(EObject element)
	 * 
	 */
	public boolean isContainedInCommentMediatorsTable(EObject element) {
		return ((ReferencesTableSettings)commentMediators.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EsbMessages.DataServicesCallMediatorOutputConnector_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}