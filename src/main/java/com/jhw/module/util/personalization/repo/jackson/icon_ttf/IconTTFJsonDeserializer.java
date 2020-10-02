package com.jhw.module.util.personalization.repo.jackson.icon_ttf;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.node.TextNode;
import com.jhw.swing.material.standards.MaterialFontRoboto;
import com.jhw.swing.material.standards.MaterialIconsFont;
import com.jhw.swing.derivable_icons.IconTTF;
import java.io.IOException;

/**
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class IconTTFJsonDeserializer extends JsonDeserializer<IconTTF> {

    @Override
    public IconTTF deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        TreeNode root = p.getCodec().readTree(p);
        int ch = Integer.parseInt(((TextNode) root.get("ch")).textValue());
        float size = Float.parseFloat(((TextNode) root.get("size")).textValue());
        if (MaterialIconsFont.ICON_FONT.canDisplay((char) ch)) {
            return new IconTTF(MaterialIconsFont.ICON_FONT, (char) ch).deriveIcon(size);
        } else {
            return new IconTTF(MaterialFontRoboto.BOLD, (char) ch).deriveIcon(size);
        }
    }
}
