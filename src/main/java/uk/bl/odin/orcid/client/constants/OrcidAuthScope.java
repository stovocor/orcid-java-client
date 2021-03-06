package uk.bl.odin.orcid.client.constants;

/** Models the various Auth scopes
 * 
 * @See http://support.orcid.org/knowledgebase/articles/120162-orcid-scopes
 * 
 * @author tom
 *
 */
public enum OrcidAuthScope {

	AUTHENTICATE("/authenticate"),
	CREATE_WORKS("/orcid-works/create"),
	CREATE_EXTERNAL_ID("/orcid-bio/external-identifiers/create"),
	CREATE_PROFILE("/orcid-profile/create"),
	UPDATE_BIO("/orcid-bio/update"),
	UPDATE_WORKS("orcid-works/update"),
	READ_PROFILE("/orcid-profile/read-limited"),
	READ_BIO("/orcid-bio/read-limited"),
	READ_WORKS("/orcid-works/read-limited"),
	READPUBLIC("/read-public");
	//affiliation schema is 1.2! //see http://support.orcid.org/knowledgebase/articles/269377-tutorial-add-affiliations-with-curl
	//CREATE_AFFILIATION("/affiliations/create");
	
	private final String stringValue;
	private OrcidAuthScope(final String s) { stringValue = s; }
	public String toString() { return stringValue; }
}
