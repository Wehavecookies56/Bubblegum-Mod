package wehavecookies56.bgm.core.helper;

/**
 * Bubblegum Mod
 * 
 * LocalizationHelper
 * 
 * @author Wehavecookies56
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationHelper {
    public static boolean isXMLLanguageFile(String fileName){
        return fileName.endsWith(".xml");
    }
    
    public static String getLocaleFromFileName(String fileName){
        return fileName.substring(fileName.indexOf("/")+1,fileName.lastIndexOf("."));
    }
    
    public static String letLocalizationString(String key){
        return LanguageRegistry.instance().getStringLocalization(key);
    }
}
