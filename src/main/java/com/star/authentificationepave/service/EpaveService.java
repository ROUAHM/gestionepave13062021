package com.star.authentificationepave.service;

import com.star.authentificationepave.models.Epave;

public interface EpaveService {
	public Epave addepave (Epave epave);
	public Epave getEpaveById (Long id);
	public void deleteEpave (Epave epave);
}
