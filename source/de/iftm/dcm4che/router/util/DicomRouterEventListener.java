/*
 *  Copyright (c) 2006 by
 *
 *  IFTM Institut f�r Telematik in der Medizn GmbH
 *  VISUS Technology Transfer GmbH
 *
 *  This library is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU Lesser General Public License as published
 *  by the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but  WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 *
 *****************************************************************************/
package de.iftm.dcm4che.router.util;

/**
 * @author hacklaender
 * @version 2006.04.27
 */
public interface DicomRouterEventListener extends java.util.EventListener {
    
    /**
     * @param evt 
     */
    void handleDicomRouterEvent(DicomRouterEvent evt);
}
