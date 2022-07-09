package com.company.untitled1.screen.halt;

import io.jmix.ui.screen.*;
import com.company.untitled1.entity.Halt;

@UiController("Halt.edit")
@UiDescriptor("halt-edit.xml")
@EditedEntityContainer("haltDc")
public class HaltEdit extends StandardEditor<Halt> {
}