package New;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class LightroomPresetGenerator {


    public static void main(String[] args) {
        String xmpContent = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<x:xmpmeta xmlns:x=\"adobe:ns:meta/\">\n" +
                " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">\n" +
                "  <rdf:Description xmlns:crs=\"http://ns.adobe.com/camera-raw-settings/1.0/\"\n" +
                "    crs:PresetName=\"Sanctuary Glow\"\n" +
                "    crs:ProcessVersion=\"11.0\"\n" +
                "    crs:WhiteBalance=\"As Shot\"\n" +
                "    crs:Temperature=\"5350\"\n" +
                "    crs:Tint=\"5\"\n" +
                "    crs:Exposure2012=\"0.45\"\n" +
                "    crs:Contrast2012=\"15\"\n" +
                "    crs:Highlights2012=\"-40\"\n" +
                "    crs:Shadows2012=\"50\"\n" +
                "    crs:Whites2012=\"10\"\n" +
                "    crs:Blacks2012=\"-10\"\n" +
                "    crs:Clarity2012=\"10\"\n" +
                "    crs:Dehaze=\"5\"\n" +
                "    crs:Vibrance=\"20\"\n" +
                "    crs:Saturation=\"0\"\n" +
                "    crs:Sharpness=\"40\"\n" +
                "    crs:LuminanceSmoothing=\"25\"\n" +
                "    crs:ColorNoiseReduction=\"25\"\n" +
                "    crs:VignetteAmount=\"-15\"\n" +
                "    crs:LuminanceAdjustmentOrange=\"10\"\n" +
                "    crs:SaturationAdjustmentYellow=\"-10\"\n" +
                "    crs:LuminanceAdjustmentBlue=\"-10\"\n" +
                "    crs:ToneCurveName2012=\"Medium Contrast\"\n" +
                "    crs:HasSettings=\"True\"\n" +
                "    crs:SupportsAmount=\"True\"\n" +
                "    crs:ConvertToGrayscale=\"False\"/>\n" +
                " </rdf:RDF>\n" +
                "</x:xmpmeta>";

        String fileName = "Sanctuary_Glow.xmp";
        try {
            // Write the .xmp file
            FileWriter writer = new FileWriter(fileName);
            writer.write(xmpContent);
            writer.close();

            // Optionally zip it
            FileOutputStream fos = new FileOutputStream("Sanctuary_Glow_Lightroom_Preset.zip");
            ZipOutputStream zipOut = new ZipOutputStream(fos);
            ZipEntry zipEntry = new ZipEntry(fileName);
            zipOut.putNextEntry(zipEntry);
            zipOut.write(xmpContent.getBytes());
            zipOut.closeEntry();
            zipOut.close();
            fos.close();

            System.out.println("Preset created and zipped successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

