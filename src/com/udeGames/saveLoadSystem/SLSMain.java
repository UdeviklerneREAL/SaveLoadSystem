package com.udeGames.saveLoadSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Kristoffer Lund, Rafael Diolatzis
 * @since 1.1
 */
public class SLSMain {


    private String filepath;

    public SLSMain(String filepath) {
        this.filepath = filepath;
        File file = new File(this.filepath);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void encodeLong(long x, String varName) {
        File fileAsFile = new File(this.filepath);
        boolean findVarInFile = false;

        try {
            StringBuilder before = new StringBuilder();

            if (!fileAsFile.exists()) {
                fileAsFile.createNewFile();
            } else {
                Scanner scanner = new Scanner(fileAsFile);

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (line.contains("long " + varName)) {
                        line = "long " + varName + ": " + x;
                        findVarInFile = true;
                    }
                    before.append(line).append("\n");
                }

                scanner.close();
            }

            FileWriter fileWriter = new FileWriter(fileAsFile);
            if (!findVarInFile) {
                fileWriter.append(before).append("long ").append(varName).append(": ").append(String.valueOf(x));
            } else {
                fileWriter.append(before);
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void encodeLongArray(long[] x, String varName) {
        File fileAsFile = new File(filepath);
        boolean findVarInFile = false;

        try {
            StringBuilder before = new StringBuilder();

            if (!fileAsFile.exists())
                fileAsFile.createNewFile();
            else {
                Scanner scanner = new Scanner(fileAsFile);

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (line.contains("long[] " + varName)) {
                        StringBuilder value = new StringBuilder("{");
                        for (long currentValue : x) {
                            value.append(currentValue).append(",");
                        }
                        value.deleteCharAt(value.length()-1);
                        value.append("}");
                        line = "long[] " + varName + ": " + value;
                        findVarInFile = true;
                    }
                    before.append(line).append("\n");
                }

                scanner.close();
            }

            FileWriter fileWriter = new FileWriter(fileAsFile);
            if (!findVarInFile) {
                StringBuilder value = new StringBuilder("{");
                for (long currentValue : x) {
                    value.append(currentValue).append(",");
                }
                value.deleteCharAt(value.length()-1);
                value.append("}");

                fileWriter.append(before).append("long[] ").append(varName).append(": ").append(value);
            } else {
                fileWriter.append(before);
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void encodeDouble(Double x, String varName) {
        File fileAsFile = new File(filepath);
        boolean findVarInFile = false;

        try {
            StringBuilder before = new StringBuilder();

            if (!fileAsFile.exists()) {
                fileAsFile.createNewFile();
            } else {
                Scanner scanner = new Scanner(fileAsFile);

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (line.contains("double " + varName)) {
                        line = "double " + varName + ": " + x;
                        findVarInFile = true;
                    }
                    before.append(line).append("\n");
                }

                scanner.close();
            }

            FileWriter fileWriter = new FileWriter(fileAsFile);
            if (!findVarInFile) {
                fileWriter.append(before).append("double ").append(varName).append(": ").append(String.valueOf(x));
            } else {
                fileWriter.append(before);
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void encodeDoubleArray(double[] x, String varName) {
        File fileAsFile = new File(filepath);
        boolean findVarInFile = false;

        try {
            StringBuilder before = new StringBuilder();

            if (!fileAsFile.exists())
                fileAsFile.createNewFile();
            else {
                Scanner scanner = new Scanner(fileAsFile);

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (line.contains("double[] " + varName)) {
                        StringBuilder value = new StringBuilder("{");
                        for (double currentValue : x) {
                            value.append(currentValue).append(",");
                        }
                        value.deleteCharAt(value.length()-1);
                        value.append("}");
                        line = "double[] " + varName + ": " + value;
                        findVarInFile = true;
                    }
                    before.append(line).append("\n");
                }

                scanner.close();
            }

            FileWriter fileWriter = new FileWriter(fileAsFile);
            if (!findVarInFile) {
                StringBuilder value = new StringBuilder("{");
                for (double currentValue : x) {
                    value.append(currentValue).append(",");
                }
                value.deleteCharAt(value.length()-1);
                value.append("}");

                fileWriter.append(before).append("double[] ").append(varName).append(": ").append(value);
            } else {
                fileWriter.append(before);
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void encodeBoolean(boolean x, String varName) {
        File fileAsFile = new File(filepath);
        boolean findVarInFile = false;

        try {
            StringBuilder before = new StringBuilder();

            if (!fileAsFile.exists()) {
                fileAsFile.createNewFile();
            } else {
                Scanner scanner = new Scanner(fileAsFile);

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (line.contains("bool " + varName)) {
                        line = "bool " + varName + ": " + x;
                        findVarInFile = true;
                    }
                    before.append(line).append("\n");
                }

                scanner.close();
            }

            FileWriter fileWriter = new FileWriter(fileAsFile);
            if (!findVarInFile) {
                fileWriter.append(before).append("bool ").append(varName).append(": ").append(String.valueOf(x));
            } else {
                fileWriter.append(before);
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void encodeBooleanArray(boolean[] x, String varName) {
        File fileAsFile = new File(filepath);
        boolean findVarInFile = false;

        try {
            StringBuilder before = new StringBuilder();

            if (!fileAsFile.exists())
                fileAsFile.createNewFile();
            else {
                Scanner scanner = new Scanner(fileAsFile);

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (line.contains("bool[] " + varName)) {
                        StringBuilder value = new StringBuilder("{");
                        for (boolean currentValue : x) {
                            value.append(currentValue).append(",");
                        }
                        value.deleteCharAt(value.length()-1);
                        value.append("}");
                        line = "bool[] " + varName + ": " + value;
                        findVarInFile = true;
                    }
                    before.append(line).append("\n");
                }

                scanner.close();
            }

            FileWriter fileWriter = new FileWriter(fileAsFile);
            if (!findVarInFile) {
                StringBuilder value = new StringBuilder("{");
                for (boolean currentValue : x) {
                    value.append(currentValue).append(",");
                }
                value.deleteCharAt(value.length()-1);
                value.append("}");

                fileWriter.append(before).append("bool[] ").append(varName).append(": ").append(value);
            } else {
                fileWriter.append(before);
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void encodeString(String x, String varName) {
        if (x.contains('"' + "") || x.contains("{") || x.contains("}") || x.contains(","))
            throw new RuntimeException("SLSString cant include " + '"' + " or { or } or ,");
        File fileAsFile = new File(filepath);
        boolean findVarInFile = false;

        try {
            StringBuilder before = new StringBuilder();

            if (!fileAsFile.exists()) {
                fileAsFile.createNewFile();
            } else {
                Scanner scanner = new Scanner(fileAsFile);

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (line.contains("string " + varName)) {
                        line = "string " + varName + ": " + '"' + x + '"';
                        findVarInFile = true;
                    }
                    before.append(line).append("\n");
                }

                scanner.close();
            }

            FileWriter fileWriter = new FileWriter(fileAsFile);
            if (!findVarInFile) {
                fileWriter.append(before).append("string ").append(varName).append(": ").append('"').append(x).append('"');
            } else {
                fileWriter.append(before);
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void encodeStringArray(String[] x, String varName) {
        for (String y : x) {
            if (y.contains('"' + "") || y.contains("{") || y.contains("}") || y.contains(","))
                throw new RuntimeException("SLSString cant include " + '"' + " or { or } or ,");
        }
        File fileAsFile = new File(filepath);
        boolean findVarInFile = false;

        try {
            StringBuilder before = new StringBuilder();

            if (!fileAsFile.exists())
                fileAsFile.createNewFile();
            else {
                Scanner scanner = new Scanner(fileAsFile);

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (line.contains("string[] " + varName)) {
                        StringBuilder value = new StringBuilder("{");
                        for (String currentValue : x) {
                            value.append('"').append(currentValue).append('"').append(",");
                        }
                        value.deleteCharAt(value.length()-1);
                        value.append("}");
                        line = "string[] " + varName + ": " + value;
                        findVarInFile = true;
                    }
                    before.append(line).append("\n");
                }

                scanner.close();
            }

            FileWriter fileWriter = new FileWriter(fileAsFile);
            if (!findVarInFile) {
                StringBuilder value = new StringBuilder("{");
                for (String currentValue : x) {
                    value.append('"').append(currentValue).append('"').append(",");
                }
                value.deleteCharAt(value.length()-1);
                value.append("}");

                fileWriter.append(before).append("string[] ").append(varName).append(": ").append(value);
            } else {
                fileWriter.append(before);
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public long decodeLong(String varName) {
        File fileAsFile = new File(filepath);

        if (!fileAsFile.exists()) {
            throw new RuntimeException("File " + filepath + " dose not exits!");
        }

        try {
            Scanner scanner = new Scanner(fileAsFile);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.contains("long " + varName)) {
                    return Long.parseLong(line.split(": ")[1]);
                }
            }

            scanner.close();
            throw new RuntimeException("Can't find var " + varName + " in file: " + file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(Arrays.toString(e.getStackTrace()));
        }
    }

    public long[] decodeLongArray(String varName) {
        File fileAsFile = new File(filepath);

        if (!fileAsFile.exists()) {
            throw new RuntimeException("File " + filepath + " dose not exits!");
        }

        try {
            Scanner scanner = new Scanner(fileAsFile);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.contains("long[] " + varName)) {
                    long[] value;
                    String[] values = (line.split("[{]")[1]).split(",");
                    if (values.length >= 1) {
                        values[values.length - 1] = values[values.length - 1].split("}")[0];
                        value = new long[values.length];
                    } else
                        value = new long[0];
                    int index = 0;
                    for (String current : values) {
                        value[index] = Long.parseLong(current);
                        index++;
                    }
                    return value;
                }
            }

            scanner.close();
            throw new RuntimeException("Can't find var " + varName + " in file: " + file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(Arrays.toString(e.getStackTrace()));
        }
    }

    public double decodeDouble(String varName) {
        File fileAsFile = new File(filepath);

        if (!fileAsFile.exists()) {
            throw new RuntimeException("File " + filepath + " dose not exits!");
        }

        try {
            Scanner scanner = new Scanner(fileAsFile);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.contains("double " + varName)) {
                    return Double.parseDouble(line.split(": ")[1]);
                }
            }

            scanner.close();
            throw new RuntimeException("Can't find var " + varName + " in file: " + file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(Arrays.toString(e.getStackTrace()));
        }
    }

    public double[] decodeDoubleArray(String varName) {
        File fileAsFile = new File(filepath);

        if (!fileAsFile.exists()) {
            throw new RuntimeException("File " + filepath + " dose not exits!");
        }

        try {
            Scanner scanner = new Scanner(fileAsFile);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.contains("double[] " + varName)) {
                    double[] value;
                    String[] values = (line.split("[{]")[1]).split(",");
                    if (values.length >= 1) {
                        values[values.length - 1] = values[values.length - 1].split("}")[0];
                        value = new double[values.length];
                    } else
                        value = new double[0];
                    int index = 0;
                    for (String current : values) {
                        value[index] = Double.parseDouble(current);
                        index++;
                    }
                    return value;
                }
            }

            scanner.close();
            throw new RuntimeException("Can't find var " + varName + " in file: " + file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(Arrays.toString(e.getStackTrace()));
        }
    }

    public boolean decodeBoolean(String varName) {
        File fileAsFile = new File(filepath);

        if (!fileAsFile.exists()) {
            throw new RuntimeException("File " + filepath + " dose not exits!");
        }

        try {
            Scanner scanner = new Scanner(fileAsFile);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.contains("bool " + varName)) {
                    return Boolean.parseBoolean(line.split(": ")[1]);
                }
            }

            scanner.close();
            throw new RuntimeException("Can't find var " + varName + " in file: " + file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(Arrays.toString(e.getStackTrace()));
        }
    }

    public boolean[] decodeBooleanArray(String varName) {
        File fileAsFile = new File(filepath);

        if (!fileAsFile.exists()) {
            throw new RuntimeException("File " + filepath + " dose not exits!");
        }

        try {
            Scanner scanner = new Scanner(fileAsFile);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.contains("bool[] " + varName)) {
                    boolean[] value;
                    String[] values = (line.split("[{]")[1]).split(",");
                    if (values.length >= 1) {
                        values[values.length - 1] = values[values.length - 1].split("}")[0];
                        value = new boolean[values.length];
                    } else
                        value = new boolean[0];
                    int index = 0;
                    for (String current : values) {
                        value[index] = Boolean.parseBoolean(current);
                        index++;
                    }
                    return value;
                }
            }

            scanner.close();
            throw new RuntimeException("Can't find var " + varName + " in file: " + file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(Arrays.toString(e.getStackTrace()));
        }
    }

    public String decodeString(String varName) {
        File fileAsFile = new File(filepath);

        if (!fileAsFile.exists()) {
            throw new RuntimeException("File " + filepath + " dose not exits!");
        }

        try {
            Scanner scanner = new Scanner(fileAsFile);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.contains("string " + varName)) {
                    return line.split('"' + "")[1];
                }
            }

            scanner.close();
            throw new RuntimeException("Can't find var " + varName + " in file: " + file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(Arrays.toString(e.getStackTrace()));
        }
    }

    public String[] decodeStringArray(String varName) {
        File fileAsFile = new File(filepath);

        if (!fileAsFile.exists()) {
            throw new RuntimeException("File " + filepath + " dose not exits!");
        }

        try {
            Scanner scanner = new Scanner(fileAsFile);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.contains("string[] " + varName)) {
                    String[] value;
                    String[] values = (line.split("[{]")[1]).split(",");
                    if (values.length >= 1) {
                        values[values.length - 1] = values[values.length - 1].split("}")[0];
                        for (int i = 0; i <= values.length - 1; i++) {
                            values[i] = values[i].split('"' + "")[1];
                        }
                        value = new String[values.length];
                    } else
                        value = new String[0];
                    int index = 0;
                    for (String current : values) {
                        value[index] = current;
                        index++;
                    }
                    return value;
                }
            }

            scanner.close();
            throw new RuntimeException("Can't find var " + varName + " in file: " + file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(Arrays.toString(e.getStackTrace()));
        }
    }

    public void setFilepath(String newFilePath){
        this.filepath = newFilePath;
    }

    public String getFilepath() { return this.filepath; }
}
