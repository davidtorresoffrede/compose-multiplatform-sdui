package br.com.developes.sdui.layout

import br.com.developes.sdui.SDLibrary
import br.com.developes.sdui.layout.components.SDCAnimatedVisibility
import br.com.developes.sdui.layout.components.SDCBox
import br.com.developes.sdui.layout.components.SDCButton
import br.com.developes.sdui.layout.components.SDCButtonIcon
import br.com.developes.sdui.layout.components.SDCButtonText
import br.com.developes.sdui.layout.components.SDCColumn
import br.com.developes.sdui.layout.components.SDCImage
import br.com.developes.sdui.layout.components.SDCRow
import br.com.developes.sdui.layout.components.SDCText
import br.com.developes.sdui.layout.components.SDCTextField

class SDLayout : SDLibrary("layout") {
    init {
        addComponentLayout("box") { node, state -> SDCBox(node, state) }
        addComponentLayout("column") { node, state -> SDCColumn(node, state) }
        addComponentLayout("row") { node, state -> SDCRow(node, state) }
        addComponentLayout("text") { node, state -> SDCText(node, state) }
        addComponentLayout("textField") { node, state -> SDCTextField(node, state) }
        addComponentLayout("animatedVisibility") { node, state -> SDCAnimatedVisibility(node, state) }
        addComponentLayout("imageFile") { node, state -> SDCImage(node, state) }
        addComponentLayout("button") { node, state -> SDCButton(node, state) }
        addComponentLayout("textButton") { node, state -> SDCButtonText(node, state) }
        addComponentLayout("iconButton") { node, state -> SDCButtonIcon(node, state) }
    }
}