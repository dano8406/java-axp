package xps.impl.ui.rendering;

import java.awt.image.BufferedImage;

import xps.impl.zipfileaccess.XPSZipFileAccess;
import xps.model.document.IDocumentReference;
import xps.model.document.page.visitor.CachingResourceLoader;

public class ImageLoader extends CachingResourceLoader<BufferedImage>{

	public ImageLoader(IDocumentReference docRef, XPSZipFileAccess access) {
		super(docRef, access);
	}

	@Override
	protected BufferedImage loadData(String uri) throws Exception {
		return getFileAccess().getImageResource(uri,  getDocument());
	}


}