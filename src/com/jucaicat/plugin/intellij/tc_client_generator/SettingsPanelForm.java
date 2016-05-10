package com.jucaicat.plugin.intellij.tc_client_generator;

import javax.swing.*;

/**
 * Created by HUANG_YA_DONG cast ZHANG_SAN_FENG on 16/3/23.
 * 设置面板的配置项
 */
public class SettingsPanelForm {
    private JPanel rootComponent;
    private JTextField commandPropertiesField;
    private JTextField feignClientField;

    @SuppressWarnings("unused")
    private JLabel commandPropertiesLabel;
    @SuppressWarnings("unused")
    private JLabel feignClientLabel;


    JPanel getRootComponent() {
        return rootComponent;
    }

    void setData(GeneratorComponent data) {
        commandPropertiesField.setText(data.getCommandPropertiesPhrase());
        feignClientField.setText(data.getFeignClientPhrase());
    }

    void getData(GeneratorComponent data) {
        data.setCommandPropertiesPhrase(commandPropertiesField.getText());
        data.setFeignClientPhrase(feignClientField.getText());
    }

    boolean isModified(GeneratorComponent data) {

        boolean isCommandPropertiesChanged = commandPropertiesField.getText() != null ?
                !commandPropertiesField.getText().equals(data.getCommandPropertiesPhrase()) :
                data.getCommandPropertiesPhrase() != null;

        boolean isFeignClientChanged = feignClientField.getText() != null ?
                !feignClientField.getText().equals(data.getFeignClientPhrase()) :
                data.getFeignClientPhrase() != null;

        return isCommandPropertiesChanged || isFeignClientChanged;
    }
}
