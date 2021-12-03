package com.topup.topup.utils;

public class Facts
{
	public static String[] factsList = {

		"একটি জাম্বো জেটে যে পরিমাণ জ্বালানী থাকে, তা দিয়ে একটি সাধারণ গাড়ি চারবার পৃথিবী ঘুরে আসতে পারবে",
		"মহাশূন্যে এমন এক পানির আধার ভাসমান অবস্থায় আছে যা সূর্যের তুলনায় ১ লাখ গুন বড়",
		"একজন ব্যক্তি গড়ে প্রতিদিন এক গ্যালনের এক চতুর্থাংশ শ্লেষ্মা গিলে ফেলে",
		"মশা দূর করার ওষুধ আসলে মশা দূর করে না। এটি মশার সেন্সর অকার্যকর করে দেয়। ফলে আপনার অবস্থান শনাক্ত করতে ব্যর্থ হয় মশা",
		"মানুষের নিপল থাকে কেন? কারণ Y ক্রোমোজোম প্রবেশ করার আগ পর্যন্ত সবাই নারী থাকে ( X ক্রোমোজোম)",
		
		"কোন অনুভূতি স্নায়ুতন্ত্রের মধ্য দিয়ে ঘন্টায় ২০০ মাইল বেগে প্রবাহিত হয়",
		"দেহে অক্সিজেন সরবরাহকারী লোহিত রক্ত কণিকার পরিমাণ ২৫০০ কোটি এবং এরা ৪ মাস বাঁচে",
		"প্রশান্ত মহাসাগরে এমন একটি আবর্জনার স্তুপ ঘূর্ণায়মান আছে যার আকার টেক্সাসের সমান",
		"মানুষের মস্তিষ্ক যদি কম্পিউটার হত তাহলে এটি প্রতি সেকেন্ডে ৩৮ হাজার ট্রিলিয়ন কমান্ডের সমাধান দিতে পারতো",
		"চাঁদের বুকে ওয়াইফাই ইন্টারনেট পৌঁছে দিতে সক্ষম হয়েছে নাসা",
		
		"বিশ্বের একমাত্র প্রাকৃতিক সমুদ্র বন্দর হলো চট্টগ্রাম সমুদ্র বন্দর !",
		"বাংলাদেশে আন্তঃমহাদেশীয় ক্ষেপণাস্ত্র স্থাপন করলে তা ৫,০০০ কিঃমিঃ এর অধিক এলাকা রেঞ্জে রাখবে",
		"মালয়েশিয়ার উন্নয়নের অগ্রদূত মাহাথির বিন মোহাম্মদ একজন বাংলাদেশি ব্যক্তির নাতি !",
		"সবমিলিয়ে প্রায় ৭০০টি নদী রয়েছে বাংলাদেশে। যা আর কোনো দেশের ইতিহাসে বিরল !",
		"যে সকল বিদেশি একবার ঢাকা ঘুরে গেছেন তারা একে সারাজীবন মনে রাখেন এর বিখ্যাত ট্রাফিক জ্যামের কারনে।",
		
		"মাত্র ৫ লিটার মধু খেয়ে এক একটি মৌমাছির ঝাঁক ৪০ হাজার মাইল পথ পাড়ি দিতে পারে",
		"একজন মানুষের জীবনে ৪০ পাউন্ড চামড়া ঝরে যায়। অর্থাৎ সে হিসেবে প্রতি মাসে একবার দেহের চামড়া পরিবর্তিত হয়",
		"কোয়েলা ঘুম কাতুরে। ওরা দিনের ২৪ ঘন্টার মধ্যে ১৮ ঘন্টাই ঘুমিয়ে কাটায়",
		"ডাকটিকেটের পেছনে প্রথম আঁঠা লাগানোর পদ্ধতি চালু করে সিয়েরা লিয়ন। সালটা ছিলো ১৯৬৪",
		"আপনি যে পানি পান করছেন তার একটি অংশ এর আগে কেউ পান করেছিল। হয়তোবা কয়েকবারও!",
		
		"ফেসবুকের বর্তমানে ২ বিলিয়ন ব্যবহারকারী রয়েছেন যদি এটি একটি দেশ হত তবে এটি পৃথিবীর সর্বাধিক জনবহুল দেশ হয়ে উঠত",
		"২০১৬ সালে আইওএস এবং অ্যান্ড্রয়েড মোবাইল ডিভাইসগুলিতে ৯০ বিলিয়ন অ্যাপ ডাউনলোড হয়েছে",
		"গুগল শুরু করেছিলেন দু'জন কলেজ ছাত্র - তাদের নাম ল্যারি পেজ এবং সের্গেই ব্রিন",
		"প্রথম গুগল সার্ভার রাখা হয়েছিল লেগো দিয়ে তৈরি একটি কাস্টম কেসে",
		"গুগল সার্চে ১৫ শতাংশ অনুসন্ধানই হচ্ছে একেবারে নতুন - যা আগে কখনো সার্চ করা হয় নি"
	};
	
	public static String getFactByIndex(int index) {
		try {
			if (factsList.length <= index) return factsList[factsList.length - 1];
			return factsList[index];
		} catch (Exception e) {
			return e.toString();
		}
	}
}
