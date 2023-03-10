package com.badlogic.gdx.tools.particleeditor;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class CountPanel extends EditorPanel {
    Slider maxSlider, minSlider;

    public CountPanel(final ParticleEditor editor, String name, String description) {
        super(null, name, description);

        initializeComponents();

        maxSlider.setValue(editor.getEmitter().getMaxParticleCount());
        maxSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent event) {
                editor.getEmitter().setMaxParticleCount((int) maxSlider.getValue());
            }
        });

        minSlider.setValue(editor.getEmitter().getMinParticleCount());
        minSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent event) {
                editor.getEmitter().setMinParticleCount((int) minSlider.getValue());
            }
        });
    }

    private void initializeComponents() {
        JPanel contentPanel = getContentPanel();
        {
            JLabel label = new JLabel("Min:");
            contentPanel.add(label, new GridBagConstraints(0, 1, 1, 1, 0, 0, GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(0, 0, 0, 6), 0, 0));
        }
        {
            minSlider = new Slider(0, 0, 99999, 1, 0, 500);
            contentPanel.add(minSlider, new GridBagConstraints(1, 1, 1, 1, 0, 0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
        }
        {
            JLabel label = new JLabel("Max:");
            contentPanel.add(label, new GridBagConstraints(2, 1, 1, 1, 0, 0, GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(0, 12, 0, 6), 0, 0));
        }
        {
            maxSlider = new Slider(0, 0, 99999, 1, 0, 500);
            contentPanel.add(maxSlider, new GridBagConstraints(3, 1, 1, 1, 1, 0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
        }
    }
}
