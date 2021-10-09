package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object G_Timeout
     
    /**
     * <p></p>
     */
    public static Object G_NotificationMessage
     
    /**
     * <p></p>
     */
    public static Object G_AndroidApp
     
    /**
     * <p></p>
     */
    public static Object G_ShortTimeOut
     
    /**
     * <p>Profile Staging : Staging EndPoint</p>
     */
    public static Object baseURL
     
    /**
     * <p></p>
     */
    public static Object feedURL
     
    /**
     * <p></p>
     */
    public static Object podcastID
     
    /**
     * <p></p>
     */
    public static Object podcastTitle
     
    /**
     * <p></p>
     */
    public static Object podcastAuthor
     
    /**
     * <p></p>
     */
    public static Object podcastLang
     
    /**
     * <p></p>
     */
    public static Object podcastCountry
     
    /**
     * <p></p>
     */
    public static Object podcastWebsite
     
    /**
     * <p></p>
     */
    public static Object podcastCQWebsite
     
    /**
     * <p></p>
     */
    public static Object podcastRSS
     
    /**
     * <p></p>
     */
    public static Object podcastThumbnail
     
    /**
     * <p></p>
     */
    public static Object podcastCQThumbnail
     
    /**
     * <p></p>
     */
    public static Object podcastDescription
     
    /**
     * <p></p>
     */
    public static Object podcastcategories0
     
    /**
     * <p></p>
     */
    public static Object podcastcategories1
     
    /**
     * <p></p>
     */
    public static Object podcastcategories2
     
    /**
     * <p></p>
     */
    public static Object podcastCQcategories0
     
    /**
     * <p></p>
     */
    public static Object podcastCQcategories1
     
    /**
     * <p></p>
     */
    public static Object podcastCQcategories2
     
    /**
     * <p></p>
     */
    public static Object podcastCopyright
     
    /**
     * <p></p>
     */
    public static Object podcastLicense
     
    /**
     * <p></p>
     */
    public static Object PodcastIDForTag
     
    /**
     * <p></p>
     */
    public static Object huaweiNonce
     
    /**
     * <p></p>
     */
    public static Object huaweiSecretkey
     
    /**
     * <p></p>
     */
    public static Object huaweiTimestamp
     
    /**
     * <p></p>
     */
    public static Object huaweiBaseURL
     
    /**
     * <p></p>
     */
    public static Object classifierBaseURL
     
    /**
     * <p>Profile Staging : CMS Staging Environment</p>
     */
    public static Object CMSStaging
     
    /**
     * <p>Profile Staging : New CMS endpoint</p>
     */
    public static Object CMSStagingNew
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            G_Timeout = selectedVariables['G_Timeout']
            G_NotificationMessage = selectedVariables['G_NotificationMessage']
            G_AndroidApp = selectedVariables['G_AndroidApp']
            G_ShortTimeOut = selectedVariables['G_ShortTimeOut']
            baseURL = selectedVariables['baseURL']
            feedURL = selectedVariables['feedURL']
            podcastID = selectedVariables['podcastID']
            podcastTitle = selectedVariables['podcastTitle']
            podcastAuthor = selectedVariables['podcastAuthor']
            podcastLang = selectedVariables['podcastLang']
            podcastCountry = selectedVariables['podcastCountry']
            podcastWebsite = selectedVariables['podcastWebsite']
            podcastCQWebsite = selectedVariables['podcastCQWebsite']
            podcastRSS = selectedVariables['podcastRSS']
            podcastThumbnail = selectedVariables['podcastThumbnail']
            podcastCQThumbnail = selectedVariables['podcastCQThumbnail']
            podcastDescription = selectedVariables['podcastDescription']
            podcastcategories0 = selectedVariables['podcastcategories0']
            podcastcategories1 = selectedVariables['podcastcategories1']
            podcastcategories2 = selectedVariables['podcastcategories2']
            podcastCQcategories0 = selectedVariables['podcastCQcategories0']
            podcastCQcategories1 = selectedVariables['podcastCQcategories1']
            podcastCQcategories2 = selectedVariables['podcastCQcategories2']
            podcastCopyright = selectedVariables['podcastCopyright']
            podcastLicense = selectedVariables['podcastLicense']
            PodcastIDForTag = selectedVariables['PodcastIDForTag']
            huaweiNonce = selectedVariables['huaweiNonce']
            huaweiSecretkey = selectedVariables['huaweiSecretkey']
            huaweiTimestamp = selectedVariables['huaweiTimestamp']
            huaweiBaseURL = selectedVariables['huaweiBaseURL']
            classifierBaseURL = selectedVariables['classifierBaseURL']
            CMSStaging = selectedVariables['CMSStaging']
            CMSStagingNew = selectedVariables['CMSStagingNew']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
