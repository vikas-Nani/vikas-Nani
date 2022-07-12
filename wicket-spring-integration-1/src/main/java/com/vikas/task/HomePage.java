package com.vikas.task;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.data.DataView;
import org.apache.wicket.markup.repeater.data.ListDataProvider;
import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;
	@Autowired
	private AnimalService animalservice;
	

    public HomePage(final PageParameters parameters) {
    	 DataView<Animals> view=new DataView<Animals>("row",new ListDataProvider<Animals>(animalservice.getallanimals())) {

			
			private static final long serialVersionUID = 1L;

			@Override
			protected void populateItem(Item<Animals> item) {
				 final Animals data= item.getModelObject();
	                item.add(new Label("col1", data.getId()));
	                item.add(new Label("col2", data.getName()));
	                item.add(new Label("col3", data.getColor()));
				
			}
		};
    	
   add(view);
				
    	 
    }
}
