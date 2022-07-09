package com.company.untitled1.screen.halt;

import io.jmix.ui.screen.*;
import com.company.untitled1.entity.Halt;

@UiController("Halt.browse")
@UiDescriptor("halt-browse.xml")
@LookupComponent("haltsTable")
public class HaltBrowse extends StandardLookup<Halt> {
}