package com.sleephenetech.app.code.model;

import java.util.ArrayList;

public interface CodeService {
	public ArrayList<CodeVO> codesDB(CodeVO vo);
	public CodeVO menuDB(CodeVO vo);
}
