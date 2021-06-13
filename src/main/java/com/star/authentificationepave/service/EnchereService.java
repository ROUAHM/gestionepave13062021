package com.star.authentificationepave.service;

import com.star.authentificationepave.models.Enchere;

public interface EnchereService {
	public Enchere addenchere(Enchere enchere);
	public Enchere getencherebyid (Long id);
	public void deleteEnchere(Enchere enchere);


}