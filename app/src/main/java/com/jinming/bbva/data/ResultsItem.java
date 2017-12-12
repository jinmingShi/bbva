package com.jinming.bbva.data;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResultsItem{

	@SerializedName("reference")
	private String reference;

	@SerializedName("formatted_address")
	private String formattedAddress;

	@SerializedName("types")
	private List<String> types;

	@SerializedName("icon")
	private String icon;

	@SerializedName("name")
	private String name;

	@SerializedName("geometry")
	private Geometry geometry;

	@SerializedName("id")
	private String id;

	@SerializedName("place_id")
	private String placeId;

	public void setReference(String reference){
		this.reference = reference;
	}

	public String getReference(){
		return reference;
	}

	public void setFormattedAddress(String formattedAddress){
		this.formattedAddress = formattedAddress;
	}

	public String getFormattedAddress(){
		return formattedAddress;
	}

	public void setTypes(List<String> types){
		this.types = types;
	}

	public List<String> getTypes(){
		return types;
	}

	public void setIcon(String icon){
		this.icon = icon;
	}

	public String getIcon(){
		return icon;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setGeometry(Geometry geometry){
		this.geometry = geometry;
	}

	public Geometry getGeometry(){
		return geometry;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setPlaceId(String placeId){
		this.placeId = placeId;
	}

	public String getPlaceId(){
		return placeId;
	}

	@Override
 	public String toString(){
		return 
			"ResultsItem {" +
			"reference = '" + reference + '\'' + 
			",formatted_address = '" + formattedAddress + '\'' + 
			",types = '" + types + '\'' + 
			",icon = '" + icon + '\'' + 
			",name = '" + name + '\'' + 
			",geometry = '" + geometry + '\'' + 
			",id = '" + id + '\'' + 
			",place_id = '" + placeId + '\'' + 
			"}";
		}
}