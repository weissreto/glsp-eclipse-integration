/********************************************************************************
 * Copyright (c) 2020 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 ********************************************************************************/
package org.eclipse.glsp.ide.editor.actions.handlers;

import java.util.List;

import org.eclipse.glsp.ide.editor.utils.IdeServerMessageUtil;
import org.eclipse.glsp.server.actions.AbstractActionHandler;
import org.eclipse.glsp.server.actions.Action;
import org.eclipse.glsp.server.actions.ServerMessageAction;
import org.eclipse.glsp.server.model.GModelState;

import com.google.inject.Inject;

public class IdeServerMessageActionHandler extends AbstractActionHandler<ServerMessageAction> {

   @Inject
   protected GModelState modelState;

   @Override
   protected List<Action> executeAction(final ServerMessageAction action) {
      IdeServerMessageUtil.log(action, modelState.getClientId());
      return none();
   }

}
