/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.debugger

import com.intellij.debugger.SourcePosition
import com.intellij.openapi.editor.Editor
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile

abstract class DelegateSourcePosition(private var delegate: SourcePosition) : SourcePosition() {
    override fun getFile(): PsiFile = delegate.file
    override fun getElementAt(): PsiElement = delegate.elementAt
    override fun getLine(): Int = delegate.line
    override fun getOffset(): Int = delegate.offset

    override fun openEditor(requestFocus: Boolean): Editor = delegate.openEditor(requestFocus)

    override fun canNavigate(): Boolean = delegate.canNavigate()
    override fun canNavigateToSource(): Boolean = delegate.canNavigateToSource()

    override fun navigate(requestFocus: Boolean) {
        delegate.navigate(requestFocus)
    }

    override fun hashCode(): Int = delegate.hashCode()
    override fun equals(other: Any?): Boolean = delegate == other

    override fun toString(): String = "DSP($delegate)"
}