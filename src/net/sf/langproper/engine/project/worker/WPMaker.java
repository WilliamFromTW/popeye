/**
 Popeye - Java (Language) Properties File Editor

 Copyright (C) 2005 Raik Nagel <kiar@users.sourceforge.net>
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions are met:

 * Redistributions of source code must retain the above copyright notice,
  this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice,
  this list of conditions and the following disclaimer in the documentation
  and/or other materials provided with the distribution.
 * Neither the name of the author nor the names of its contributors may be
  used to endorse or promote products derived from this software without
  specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER
 OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR
 OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */


// created by : r.nagel 15.09.2005
//
// function : make an instance
//
// todo     :
//
// modified :

package net.sf.langproper.engine.project.worker ;

import net.sf.langproper.engine.project.* ;
import net.sf.langproper.gui.filechooser.ProjectFileFilter;

public class WPMaker extends TProjectMaker
{
  public static final String TYPE_NAME = "worker bundle" ;

  public TProject getInstance()
  {
    return new WorkerProject();
  }

  public String getTypeName()
  {
    return TYPE_NAME ;
  }

  /** insert the file extension(s) into the filter */
  public void insertFileFilter(ProjectFileFilter filter)
  {
    filter.addExtension( "catalog" ) ;
    filter.setDescription( "worker language catalog file" ) ;
  }

}
