package bgm.core.handlers;

import bgm.core.helper.LocalizationHelper;
import bgm.lib.Localizations;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * Bubblegum Mod
 * 
 * LocalizationHandler
 * 
 * @author Wehavecookies56
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class LocalizationHandler {
    public static void loadlanguages(){
        for(String LocationFile: Localizations.localeFiles){
            LanguageRegistry.instance().loadLocalization(LocationFile, LocalizationHelper.getLocaleFromFileName(LocationFile) ,LocalizationHelper.isXMLLanguageFile(LocationFile));
        }
    }

}
