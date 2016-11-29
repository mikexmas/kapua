/*******************************************************************************
 * Copyright (c) 2011, 2016 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.kapua.service.authorization.role;

import java.util.Set;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import org.eclipse.kapua.model.KapuaEntityCreator;
import org.eclipse.kapua.service.authorization.permission.Permission;

/**
 * Role creator service definition.
 * 
 * @since 1.0
 * 
 */
public interface RoleCreator extends KapuaEntityCreator<Role> {

    /**
     * Set the permission name
     * 
     * @param name
     */
    public void setName(String name);

    /**
     * Return the permission name
     * 
     * @return
     */
    @XmlElement(name = "name")
    public String getName();

    /**
     * Set the {@link RolePermission} set
     * 
     * @param permissions
     */
    public void setPermissions(Set<Permission> permissions);

    /**
     * Return the {@link RolePermission} set
     * 
     * @return
     */
    @XmlElementWrapper(name = "permissions")
    @XmlElement(name = "permission")
    public <P extends Permission> Set<P> getPermissions();
}
