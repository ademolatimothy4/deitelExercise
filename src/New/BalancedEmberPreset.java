package New;


import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class BalancedEmberPreset {

    public static void main(String[] args) {
        String xmpContent = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<x:xmpmeta xmlns:x=\"adobe:ns:meta/\">\n" +
                " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">\n" +
                "  <rdf:Description xmlns:crs=\"http://ns.adobe.com/camera-raw-settings/1.0/\"\n" +
                "    crs:PresetName=\"Balanced Ember\"\n" +
                "    crs:ProcessVersion=\"11.0\"\n" +
                "    crs:WhiteBalance=\"As Shot\"\n" +
                "    crs:Temperature=\"0\"\n" +
                "    crs:Tint=\"0\"\n" +
                "    crs:Exposure2012=\"0.20\"\n" +
                "    crs:Contrast2012=\"10\"\n" +
                "    crs:Highlights2012=\"-30\"\n" +
                "    crs:Shadows2012=\"35\"\n" +
                "    crs:Whites2012=\"10\"\n" +
                "    crs:Blacks2012=\"-15\"\n" +
                "    crs:Clarity2012=\"5\"\n" +
                "    crs:Dehaze=\"5\"\n" +
                "    crs:Texture=\"5\"\n" +
                "    crs:Vibrance=\"15\"\n" +
                "    crs:Saturation=\"-5\"\n" +
                "    crs:Sharpness=\"40\"\n" +
                "    crs:LuminanceSmoothing=\"20\"\n" +
                "    crs:ColorNoiseReduction=\"20\"\n" +
                "    crs:VignetteAmount=\"-10\"\n" +
                "    crs:GrainAmount=\"15\"\n" +
                "    crs:SplitToningHighlightHue=\"45\"\n" +
                "    crs:SplitToningHighlightSaturation=\"10\"\n" +
                "    crs:SplitToningShadowHue=\"220\"\n" +
                "    crs:SplitToningShadowSaturation=\"15\"\n" +
                "    crs:SplitToningBalance=\"-15\"\n" +
                "    crs:LuminanceAdjustmentOrange=\"10\"\n" +
                "    crs:HueAdjustmentYellow=\"-10\"\n" +
                "    crs:HueAdjustmentBlue=\"10\"\n" +
                "    crs:SaturationAdjustmentOrange=\"5\"\n" +
                "    crs:SaturationAdjustmentYellow=\"-10\"\n" +
                "    crs:SaturationAdjustmentBlue=\"-10\"\n" +
                "    crs:SaturationAdjustmentGreen=\"-10\"\n" +
                "    crs:ToneCurveName2012=\"Medium Contrast\"\n" +
                "    crs:HasSettings=\"True\"\n" +
                "    crs:SupportsAmount=\"True\"\n" +
                "    crs:ConvertToGrayscale=\"False\"/>\n" +
                " </rdf:RDF>\n" +
                "</x:xmpmeta>";

        String fileName = "Balanced_Ember.xmp";

        try {
            // Save .xmp file
            FileWriter writer = new FileWriter(fileName);
            writer.write(xmpContent);
            writer.close();

            // Zip the .xmp file
            FileOutputStream fos = new FileOutputStream("Balanced_Ember_Lightroom_Preset.zip");
            ZipOutputStream zipOut = new ZipOutputStream(fos);
            ZipEntry zipEntry = new ZipEntry(fileName);
            zipOut.putNextEntry(zipEntry);
            zipOut.write(xmpContent.getBytes());
            zipOut.closeEntry();
            zipOut.close();
            fos.close();

            System.out.println("✅ Preset created and zipped: Balanced_Ember_Lightroom_Preset.zip");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

