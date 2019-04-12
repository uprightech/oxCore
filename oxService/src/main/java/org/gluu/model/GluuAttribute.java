/*
 * oxCore is available under the MIT License (2008). See http://opensource.org/licenses/MIT for full text.
 *
 * Copyright (c) 2014, Gluu
 */
package org.gluu.model;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.gluu.model.GluuStatus;
import org.gluu.model.attribute.AttributeValidation;
import org.gluu.model.scim.ScimCustomAtribute;
import org.gluu.persist.model.base.Entry;
import org.gluu.persistence.annotation.LdapAttribute;
import org.gluu.persistence.annotation.LdapEntry;
import org.gluu.persistence.annotation.LdapJsonObject;
import org.gluu.persistence.annotation.LdapObjectClass;

/**
 * Attribute Metadata
 *
 * @author Yuriy Movchan
 * @author Javier Rojas Blum
 * @version February 9, 2015
 */
@Entry(sortBy = { "displayName" })
@ObjectClass(values = { "top", "gluuAttribute" })
public class GluuAttribute extends Entry implements Serializable {

	private static final long serialVersionUID = 4817004894646725606L;

	private transient boolean selected;

	@Attribute(ignoreDuringUpdate = true)
	private String inum;

	@Attribute(name = "oxAttributeType")
	private String type;

	@Attribute
	private String lifetime;

	@Attribute(name = "oxSourceAttribute")
	private String sourceAttribute;

	@Attribute
	private String salt;

	@Attribute(name = "oxNameIdType")
	private String nameIdType;

	@NotNull
	@Pattern(regexp = "^[a-zA-Z0-9]+$", message = "Name should contain alphabetical and numeric characters only")
	@Size(min = 1, max = 30, message = "Length of the Name should be between 1 and 30")
	@Attribute(name = "gluuAttributeName")
	private String name;

	@NotNull
	@Size(min = 0, max = 60, message = "Length of the Display Name should not exceed 60")
	@Attribute
	private String displayName;

	@NotNull
	@Size(min = 0, max = 4000, message = "Length of the Description should not exceed 4000")
	@Attribute
	private String description;

	@Attribute(name = "gluuAttributeOrigin")
	private String origin;

	@NotNull
	@Attribute(name = "gluuAttributeType")
	private GluuAttributeDataType dataType;

	@NotNull
	@Attribute(name = "gluuAttributeEditType")
	private GluuUserRole[] editType;

	@NotNull
	@Attribute(name = "gluuAttributeViewType")
	private GluuUserRole[] viewType;

	@Attribute(name = "gluuAttributeUsageType")
	private GluuAttributeUsageType[] usageType;

	@Attribute(name = "oxAuthClaimName")
	private String oxAuthClaimName;

	@Attribute(name = "seeAlso")
	private String seeAlso;

	@Attribute(name = "gluuStatus")
	private GluuStatus status;

	@Attribute(name = "gluuSAML1URI")
	private String saml1Uri;

	@Attribute(name = "gluuSAML2URI")
	private String saml2Uri;

	@Attribute(ignoreDuringUpdate = true)
	private String urn;

	@Attribute(name = "oxSCIMCustomAttribute")
	private ScimCustomAtribute oxSCIMCustomAttribute;

	@Attribute(name = "oxMultivaluedAttribute")
	private OxMultivalued oxMultivaluedAttribute;

	@Transient
	private boolean custom;

	@Transient
	private boolean requred;

	@JsonObject
	@Attribute(name = "oxValidation")
	private AttributeValidation attributeValidation;

	@Attribute(name = "gluuTooltip")
	private String gluuTooltip;

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public String getInum() {
		return inum;
	}

	public void setInum(String inum) {
		this.inum = inum;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLifetime() {
		return lifetime;
	}

	public void setLifetime(String lifetime) {
		this.lifetime = lifetime;
	}

	public String getSourceAttribute() {
		return sourceAttribute;
	}

	public void setSourceAttribute(String sourceAttribute) {
		this.sourceAttribute = sourceAttribute;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getNameIdType() {
		return nameIdType;
	}

	public void setNameIdType(String nameIdType) {
		this.nameIdType = nameIdType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public GluuAttributeDataType getDataType() {
		return dataType;
	}

	public void setDataType(GluuAttributeDataType dataType) {
		this.dataType = dataType;
	}

	public GluuUserRole[] getEditType() {
		return editType;
	}

	public void setEditType(GluuUserRole[] editType) {
		this.editType = editType;
	}

	public GluuUserRole[] getViewType() {
		return viewType;
	}

	public void setViewType(GluuUserRole[] viewType) {
		this.viewType = viewType;
	}

	public GluuAttributeUsageType[] getUsageType() {
		return usageType;
	}

	public void setUsageType(GluuAttributeUsageType[] usageType) {
		this.usageType = usageType;
	}

	public String getOxAuthClaimName() {
		return oxAuthClaimName;
	}

	public void setOxAuthClaimName(String oxAuthClaimName) {
		this.oxAuthClaimName = oxAuthClaimName;
	}

	public String getSeeAlso() {
		return seeAlso;
	}

	public void setSeeAlso(String seeAlso) {
		this.seeAlso = seeAlso;
	}

	public GluuStatus getStatus() {
		return status;
	}

	public void setStatus(GluuStatus status) {
		this.status = status;
	}

	public String getSaml1Uri() {
		return saml1Uri;
	}

	public void setSaml1Uri(String saml1Uri) {
		this.saml1Uri = saml1Uri;
	}

	public String getSaml2Uri() {
		return saml2Uri;
	}

	public void setSaml2Uri(String saml2Uri) {
		this.saml2Uri = saml2Uri;
	}

	public String getUrn() {
		return urn;
	}

	public void setUrn(String urn) {
		this.urn = urn;
	}

	public ScimCustomAtribute getOxSCIMCustomAttribute() {
		return oxSCIMCustomAttribute;
	}

	public void setOxSCIMCustomAttribute(ScimCustomAtribute oxSCIMCustomAttribute) {
		this.oxSCIMCustomAttribute = oxSCIMCustomAttribute;
	}

	public OxMultivalued getOxMultivaluedAttribute() {
		return oxMultivaluedAttribute;
	}

	public void setOxMultivaluedAttribute(OxMultivalued oxMultivaluedAttribute) {
		this.oxMultivaluedAttribute = oxMultivaluedAttribute;
	}

	public boolean isCustom() {
		return custom;
	}

	public void setCustom(boolean custom) {
		this.custom = custom;
	}

	public boolean isRequred() {
		return requred;
	}

	public void setRequred(boolean requred) {
		this.requred = requred;
	}

	public String getGluuTooltip() {
		return gluuTooltip;
	}

	public void setGluuTooltip(String gluuTooltip) {
		this.gluuTooltip = gluuTooltip;
	}

	public boolean allowEditBy(GluuUserRole role) {
		return GluuUserRole.containsRole(editType, role);
	}

	public boolean allowViewBy(GluuUserRole role) {
		return GluuUserRole.containsRole(viewType, role);
	}

	public boolean isAdminCanAccess() {
		return isAdminCanView() | isAdminCanEdit();
	}

	public boolean isAdminCanView() {
		return allowViewBy(GluuUserRole.ADMIN);
	}

	public boolean isAdminCanEdit() {
		return allowEditBy(GluuUserRole.ADMIN);
	}

	public boolean isUserCanAccess() {
		return isUserCanView() | isUserCanEdit();
	}

	public boolean isUserCanView() {
		return allowViewBy(GluuUserRole.USER);
	}

	public boolean isWhitePagesCanView() {
		return allowViewBy(GluuUserRole.WHITEPAGES);
	}

	public boolean isUserCanEdit() {
		return allowEditBy(GluuUserRole.USER);
	}

	public AttributeValidation getAttributeValidation() {
		return attributeValidation;
	}

	public void setAttributeValidation(AttributeValidation attributeValidation) {
		this.attributeValidation = attributeValidation;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (custom ? 1231 : 1237);
		result = prime * result + ((dataType == null) ? 0 : dataType.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((displayName == null) ? 0 : displayName.hashCode());
		result = prime * result + Arrays.hashCode(editType);
		result = prime * result + ((gluuTooltip == null) ? 0 : gluuTooltip.hashCode());
		result = prime * result + ((inum == null) ? 0 : inum.hashCode());
		result = prime * result + ((lifetime == null) ? 0 : lifetime.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((nameIdType == null) ? 0 : nameIdType.hashCode());
		result = prime * result + ((origin == null) ? 0 : origin.hashCode());
		result = prime * result + ((oxAuthClaimName == null) ? 0 : oxAuthClaimName.hashCode());
		result = prime * result + ((oxMultivaluedAttribute == null) ? 0 : oxMultivaluedAttribute.hashCode());
		result = prime * result + ((oxSCIMCustomAttribute == null) ? 0 : oxSCIMCustomAttribute.hashCode());
		result = prime * result + (requred ? 1231 : 1237);
		result = prime * result + ((salt == null) ? 0 : salt.hashCode());
		result = prime * result + ((saml1Uri == null) ? 0 : saml1Uri.hashCode());
		result = prime * result + ((saml2Uri == null) ? 0 : saml2Uri.hashCode());
		result = prime * result + ((seeAlso == null) ? 0 : seeAlso.hashCode());
		result = prime * result + ((sourceAttribute == null) ? 0 : sourceAttribute.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((urn == null) ? 0 : urn.hashCode());
		result = prime * result + Arrays.hashCode(usageType);
		result = prime * result + Arrays.hashCode(viewType);
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (!(obj instanceof GluuAttribute)) {
			return false;
		}
		GluuAttribute other = (GluuAttribute) obj;
		if (inum == null) {
			if (other.inum != null)
				return false;
		} else if (!inum.equals(other.inum))
			return false;
		if (custom != other.custom)
			return false;
		if (dataType != other.dataType)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		return true;
	}

}