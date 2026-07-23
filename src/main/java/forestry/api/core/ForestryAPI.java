package forestry.api.core;

public class ForestryAPI
{
	public static ForestryActiveMode activeMode = new ForestryActiveMode();

	public static boolean isModuleEnabled(String moduleName)
	{
		return false;
	}

	public static class ForestryActiveMode
	{
		public float getFloatSetting(String key)
		{
			return 1.0f;
		}
	}
}
