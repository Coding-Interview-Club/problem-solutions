def jump(nums):
    if len(nums) == 1:
        return 0

    funding = nums[0]
    seeds = 1
    max_funding_offer = nums[0]

    for i in range(len(nums)):
        if i > funding:
            seeds += 1
            funding = max_funding_offer

        if funding >= len(nums) - 1:
            return seeds

        max_funding_offer = max(max_funding_offer, i + nums[i])

    return seeds
